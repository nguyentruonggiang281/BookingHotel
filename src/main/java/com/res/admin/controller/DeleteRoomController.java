package com.res.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.dao.RoomDao;
import com.res.service.AccountService;

@WebServlet(value = "/admin/deleteRoom")
public class DeleteRoomController extends HttpServlet{

	private RoomDao roomDao = new RoomDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (AccountService.getRoleByUserLoged(req).equals("ROLE_ADMIN")) {
			String id = req.getParameter("id");
			roomDao.deleteById(Integer.valueOf(id));
			resp.sendRedirect(req.getContextPath() + "/admin/trang-chu");
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
			rd.forward(req, resp);
		}
	}

}
