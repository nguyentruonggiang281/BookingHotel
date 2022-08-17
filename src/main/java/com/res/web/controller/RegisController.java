package com.res.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.dao.AccountDao;
import com.res.model.Account;

@WebServlet(value = "/regis")
public class RegisController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private AccountDao accountDao = new AccountDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/regis.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullname = req.getParameter("fullname");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String password = req.getParameter("password");
		String repassword = req.getParameter("repassword");
		Account account = new Account(phone, password, address, null);
		if(password.equals(repassword)) {
			accountDao.save(account);
			doGet(req, resp);
		}
	}
	
	
	
	
}
