package com.res.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.res.connect.Connect;
import com.res.model.Room;

public class RoomDao {

	Connection conn;
	PreparedStatement pre = null;
	ResultSet res = null;

	public List<Room> findAll() {
		List<Room> list = new ArrayList<Room>();
		String sql = "select * from room";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			res = pre.executeQuery();
			while (res.next()) {
				Room room = new Room(res.getInt("id"), res.getString("name"), res.getDouble("price"),
						res.getString("image"), res.getInt("stt"), res.getInt("type_room"),
						res.getString("description"));
				list.add(room);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public List<Room> searchFull(String param) {
		List<Room> list = new ArrayList<Room>();
		String sql = "SELECT * FROM room\r\n" + 
				"inner join typeroom on typeroom.id = room.type_room\r\n" + 
				"WHERE typeroom.name like ? or room.name like ? or room.description like ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, "%"+param+"%");
			pre.setString(2, "%"+param+"%");
			pre.setString(3, "%"+param+"%");
			res = pre.executeQuery();
			while (res.next()) {
				Room room = new Room(res.getInt("id"), res.getString("name"), res.getDouble("price"),
						res.getString("image"), res.getInt("stt"), res.getInt("type_room"),
						res.getString("description"));
				list.add(room);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Room findById(int id) {
		String sql = "select * from room where id = ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			res = pre.executeQuery();
			if (res.next()) {
				Room room = new Room(res.getInt("id"), res.getString("name"), res.getDouble("price"),
						res.getString("image"), res.getInt("stt"), res.getInt("type_room"),
						res.getString("description"));
				return room;
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Room> findByTypeRoomId(int typeId) {
		List<Room> list = new ArrayList<Room>();
		String sql = "select * from room where type_room = ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, typeId);
			res = pre.executeQuery();
			while (res.next()) {
				Room room = new Room(res.getInt("id"), res.getString("name"), res.getDouble("price"),
						res.getString("image"), res.getInt("stt"), res.getInt("type_room"),
						res.getString("description"));
				list.add(room);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void save(Room r) {
		String sql = "insert into room(name,price, image,type_room, description) values (?,?,?,?,?)";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, r.getName());
			pre.setDouble(2, r.getPrice());
			pre.setString(3, r.getImage());
			pre.setInt(4, r.getType_room_id());
			pre.setString(5, r.getDescription());
			pre.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void update(Room r) {
		String sql = "update room set name = ?, price=?, image= ?,type_room=?, description = ? where id = ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, r.getName());
			pre.setDouble(2, r.getPrice());
			pre.setString(3, r.getImage());
			pre.setInt(4, r.getType_room_id());
			pre.setString(5, r.getDescription());
			pre.setInt(6, r.getId());
			pre.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateStatus(int id, int stt) {
		String sql = "update room set stt=? where id = ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, stt);
			pre.setInt(2, id);
			pre.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteById(int id) {
		String sql = "delete from room where id = ?";
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
