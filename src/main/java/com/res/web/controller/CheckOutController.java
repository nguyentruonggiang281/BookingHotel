package com.res.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.res.dao.InvoiceDao;
import com.res.dao.RoomDao;
import com.res.dao.TypeRoomDao;
import com.res.model.Invoice;
import com.res.model.Room;
import com.res.model.TypeRoom;
import com.res.service.AccountService;

@WebServlet(value = "/checkout")
public class CheckOutController extends HttpServlet {

	private TypeRoomDao typeRoomDao = new TypeRoomDao();
	private RoomDao roomDao = new RoomDao();
	private InvoiceDao invoiceDao = new InvoiceDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Invoice> listInvoice = invoiceDao.findByUser(AccountService.getUserBySession(req).getId());
		List<TypeRoom> listTypeRoom = typeRoomDao.findAll();
		req.setAttribute("listTypeRoom", listTypeRoom);
		req.setAttribute("listInvoice", listInvoice);
		RequestDispatcher rd = req.getRequestDispatcher("/views/checkout.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}
