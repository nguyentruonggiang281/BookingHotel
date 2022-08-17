package com.res.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.dao.TypeRoomDao;
import com.res.model.TypeRoom;

@WebServlet(value = "/about")
public class AboutController extends HttpServlet{

	private TypeRoomDao typeRoomDao = new TypeRoomDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<TypeRoom> listTypeRoom = typeRoomDao.findAll();
		req.setAttribute("listTypeRoom", listTypeRoom);
		RequestDispatcher rd = req.getRequestDispatcher("/views/about.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
