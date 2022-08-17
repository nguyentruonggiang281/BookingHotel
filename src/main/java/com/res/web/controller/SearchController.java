package com.res.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.dao.RoomDao;
import com.res.dao.TypeRoomDao;
import com.res.model.Room;
import com.res.model.TypeRoom;

@WebServlet(value = "/search")
public class SearchController extends HttpServlet{

	private TypeRoomDao typeRoomDao = new TypeRoomDao();
	private RoomDao roomDao = new RoomDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<TypeRoom> listTypeRoom = typeRoomDao.findAll();
		req.setAttribute("listTypeRoom", listTypeRoom);
		String search = req.getParameter("search");
		List<Room> listRoom = roomDao.searchFull(search);
		req.setAttribute("listRoom", listRoom);
		
		String id = req.getParameter("id");
		if(id != null) {
			listRoom = roomDao.findByTypeRoomId(Integer.valueOf(id));
			req.setAttribute("listRoom", listRoom);
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/search.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
