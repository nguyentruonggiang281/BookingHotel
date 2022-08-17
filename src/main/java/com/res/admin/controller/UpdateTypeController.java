package com.res.admin.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import com.res.cloud.FileUpload;
import com.res.dao.TypeRoomDao;
import com.res.model.TypeRoom;
import com.res.service.AccountService;

@WebServlet(value = "/admin/updateType")
@MultipartConfig
public class UpdateTypeController extends HttpServlet {

	private TypeRoomDao typeRoomDao = new TypeRoomDao();
	public String PREFIX = "stream2file";
	public String SUFFIX = ".jpg";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		TypeRoom typeRoom = typeRoomDao.findById(Integer.valueOf(id));
		req.setAttribute("typeRoom", typeRoom);
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/updateType.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String nameRoom = request.getParameter("roomName");
		String imghidden = request.getParameter("imghidden");
		int id = Integer.valueOf(request.getParameter("id"));
		
		Part filePart = request.getPart("file");
		System.out.println(filePart.getSubmittedFileName());
		if(filePart.getSubmittedFileName() == null || filePart.getSubmittedFileName().equals("")) {
			TypeRoom type = new TypeRoom(id,nameRoom, imghidden, AccountService.getUserBySession(request).getId());
			typeRoomDao.update(type);
		}
		else{
			InputStream fileContent = filePart.getInputStream();
			File tempFile = File.createTempFile(PREFIX, SUFFIX);
			tempFile.deleteOnExit();
			try (FileOutputStream out = new FileOutputStream(tempFile)) {
				IOUtils.copy(fileContent, out);
			}
			String image = FileUpload.upload(tempFile);
			TypeRoom type = new TypeRoom(id,nameRoom, image, AccountService.getUserBySession(request).getId());
			typeRoomDao.update(type);
		}
		resp.sendRedirect(request.getContextPath() + "/admin/typeRoom");
	}
}
