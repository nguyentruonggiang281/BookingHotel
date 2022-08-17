package com.res.admin.controller;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.taglibs.standard.lang.jstl.Constants;

import com.res.cloud.FileUpload;
import com.res.dao.TypeRoomDao;
import com.res.model.Room;
import com.res.model.TypeRoom;
import com.res.service.AccountService;

@WebServlet(value = "/admin/addType")
@MultipartConfig
public class AddTypeRoomController extends HttpServlet {

	private TypeRoomDao typeRoomDao = new TypeRoomDao();
	private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB
	private final String UPLOAD_DIRECTORY = "C:uploads";
	public  String PREFIX = "stream2file";
	public  String SUFFIX = ".jpg";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (AccountService.getRoleByUserLoged(req).equals("ROLE_ADMIN")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/addType.jsp");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String image = null;
		String nameRoom = null;
		nameRoom = request.getParameter("roomName");
		Part filePart = request.getPart("file");
		InputStream fileContent = filePart.getInputStream();

		File tempFile = File.createTempFile(PREFIX, SUFFIX);
        tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            IOUtils.copy(fileContent, out);
        }
        
		image = FileUpload.upload(tempFile);
		System.out.println("name: "+nameRoom);
		TypeRoom typeRoom = new TypeRoom(nameRoom, image, AccountService.getUserBySession(request).getId());
		System.out.println(typeRoom);
		typeRoomDao.save(typeRoom);
		resp.sendRedirect(request.getContextPath() + "/admin/addType");
	}

}
