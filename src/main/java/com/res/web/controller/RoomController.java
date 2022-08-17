package com.res.web.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.res.model.Account;
import com.res.model.Invoice;
import com.res.model.Room;
import com.res.model.TypeRoom;
import com.res.service.AccountService;

@WebServlet(value = "/room")
public class RoomController extends HttpServlet {

	private TypeRoomDao typeRoomDao = new TypeRoomDao();
	private RoomDao roomDao = new RoomDao();
	private InvoiceDao invoiceDao = new InvoiceDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Room room = roomDao.findById(Integer.valueOf(id));
		List<TypeRoom> listTypeRoom = typeRoomDao.findAll();
		req.setAttribute("listTypeRoom", listTypeRoom);
		req.setAttribute("room", room);
		RequestDispatcher rd = req.getRequestDispatcher("/views/room.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (AccountService.getUserBySession(req) == null) {
			resp.sendRedirect(req.getContextPath() + "/login");
		} else {
			String tungay = req.getParameter("tungay");
			String denngay = req.getParameter("denngay");
			int id_room = Integer.valueOf(req.getParameter("id"));
			Room room = roomDao.findById(Integer.valueOf(id_room));
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date parsedDate = dateFormat.parse(tungay);
				Timestamp start = new Timestamp(parsedDate.getTime());
				parsedDate = dateFormat.parse(denngay);
				Timestamp end = new Timestamp(parsedDate.getTime());
				Account ac = AccountService.getUserBySession(req);
				int numOfDay = (int) ((end.getTime() - start.getTime()) / 1000 / 60 / 60 / 24);
				Invoice invoice = new Invoice(ac.getId(), id_room, room.getPrice(), room.getPrice() * numOfDay,
						numOfDay);
				invoice.setStart(start);
				invoice.setEnd(end);
				invoiceDao.save(invoice);

			} catch (ParseException e) {
				e.printStackTrace();
			}
			resp.sendRedirect(req.getContextPath() + "/checkout");
		}
	}
}
