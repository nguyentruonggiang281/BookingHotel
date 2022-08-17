package com.res.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.dao.InvoiceDao;

@WebServlet(value = "/deleteInvoice")
public class DeleteInvoiceController extends HttpServlet{

	private InvoiceDao invoiceDao = new InvoiceDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		invoiceDao.delete(Integer.valueOf(id));
		resp.sendRedirect(req.getContextPath() + "/checkout");
	}

	
}
