package com.res.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.dao.RoomDao;
import com.res.model.Room;
import com.res.service.AccountService;

@WebServlet(value = "/admin/trang-chu")
public class HomeController extends HttpServlet{
	
	private RoomDao roomDao = new RoomDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(AccountService.getRoleByUserLoged(req).equals("ROLE_ADMIN")) {
			String id = req.getParameter("id");
			if(id == null) {
				List<Room> listRoom = roomDao.findAll();
				req.setAttribute("listRoom", listRoom);
			}
			else {
				List<Room> listRoom = roomDao.findByTypeRoomId(Integer.valueOf(id));
				req.setAttribute("listRoom", listRoom);
			}
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/index.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
