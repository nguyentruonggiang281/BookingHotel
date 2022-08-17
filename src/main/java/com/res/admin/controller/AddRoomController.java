package com.res.admin.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
import com.res.dao.RoomDao;
import com.res.dao.TypeRoomDao;
import com.res.model.Room;
import com.res.model.TypeRoom;
import com.res.service.AccountService;

@WebServlet(value = "/admin/addRoom")
@MultipartConfig
public class AddRoomController extends HttpServlet {

	private TypeRoomDao typeRoomDao = new TypeRoomDao();
	private RoomDao roomDao = new RoomDao();
	public String PREFIX = "stream2file";
	public String SUFFIX = ".jpg";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (AccountService.getRoleByUserLoged(req).equals("ROLE_ADMIN")) {
			List<TypeRoom> listTypeRoom = typeRoomDao.findAll();
			req.setAttribute("listTypeRoom", listTypeRoom);
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/addRoom.jsp");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String nameRoom = req.getParameter("roomName");
		double price = Double.valueOf(req.getParameter("price"));
		int typeRoom = Integer.valueOf(req.getParameter("typeRoom"));
		String des = req.getParameter("des");
		Part filePart = req.getPart("file");
		InputStream fileContent = filePart.getInputStream();

		File tempFile = File.createTempFile(PREFIX, SUFFIX);
		tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            IOUtils.copy(fileContent, out);
        }
        
		String image = FileUpload.upload(tempFile);
		Room room = new Room(nameRoom, price, image, 0, typeRoom, des);
		System.out.println(room);
		roomDao.save(room);
		resp.sendRedirect(req.getContextPath() + "/admin/trang-chu");
	}

}
