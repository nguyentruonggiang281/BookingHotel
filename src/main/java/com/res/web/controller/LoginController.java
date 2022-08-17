package com.res.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.res.dao.AccountDao;
import com.res.model.Account;

@WebServlet(value = "/login")
public class LoginController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private AccountDao accountDao = new AccountDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/login.jsp");
		rd.forward(req, resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String phone = req.getParameter("phone");
		String password = req.getParameter("password");
		Account account = accountDao.login(phone, password);
		
		if(account != null) {
			HttpSession session = req.getSession();
			session.setAttribute("login", account);
			if(account.getRole().equals("ROLE_USER")) {
//				resp.sendRedirect(req.getContextPath() + "/redirected");
				resp.sendRedirect(req.getContextPath() + "/trang-chu");
			}
			else if(account.getRole().equals("ROLE_ADMIN")) {
				resp.sendRedirect(req.getContextPath() + "/admin/trang-chu");
			}
		}
		else {
			resp.sendRedirect(req.getContextPath() + "/login");
			HttpSession session = req.getSession();
			session.setAttribute("login", account);
		}
	}

	
		
}
