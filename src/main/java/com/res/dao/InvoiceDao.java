package com.res.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.res.connect.Connect;
import com.res.model.Invoice;
import com.res.model.Room;

public class InvoiceDao {

	Connection conn;
	PreparedStatement pre = null;
	ResultSet res = null;
	private RoomDao roomDao = new RoomDao();
	private TypeRoomDao typeRoom = new TypeRoomDao();

	public void save(Invoice iv) {
		String sql = "insert into invoice (account_id, room_id, price, total_price, numOfDay, start, end) values (?,?,?,?,?,?,?)";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, iv.getAccount_id());
			pre.setInt(2, iv.getRoom_id());
			pre.setDouble(3, iv.getPrice());
			pre.setDouble(4, iv.getTotal_price());
			pre.setInt(5, iv.getNumOfDay());
			pre.setTimestamp(6, iv.getStart());
			pre.setTimestamp(7, iv.getEnd());
			pre.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Invoice> findByUser(int account_id) {
		String sql = "select * from invoice i inner join room r on r.id = i.room_id inner join typeroom t on t.id = r.type_room where account_id = ?";
		List<Invoice> list = new ArrayList<Invoice>();
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, account_id);
			res = pre.executeQuery();
			while (res.next()) {
				Invoice invoice = new Invoice(res.getInt("id"), account_id, res.getInt("room_id"),
						res.getDouble("price"), res.getDouble("total_price"), res.getInt("numOfDay"));
				invoice.setStart(res.getTimestamp("start"));
				invoice.setEnd(res.getTimestamp("end"));
				Room room = roomDao.findById(res.getInt("room_id"));
				room.setTypeRoom(typeRoom.findById(res.getInt("type_room")));
				invoice.setRoom(room);
				list.add(invoice);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void delete(int id) {
		String sql = "delete from invoice where id = ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			pre.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
