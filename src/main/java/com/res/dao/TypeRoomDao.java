package com.res.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.res.connect.Connect;
import com.res.model.TypeRoom;

public class TypeRoomDao {
	Connection conn;
	PreparedStatement pre = null;
	ResultSet res = null;

	public List<TypeRoom> findAll() {
		List<TypeRoom> list = new ArrayList<TypeRoom>();
		String sql = "select * from typeroom";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			res = pre.executeQuery();
			while (res.next()) {
				TypeRoom typeRoom = new TypeRoom(res.getInt("id"), res.getString("name"), res.getString("image"),
						res.getInt("created_by"));
				list.add(typeRoom);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public TypeRoom findById(int id) {
		String sql = "select * from typeroom where id = ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			res = pre.executeQuery();
			if (res.next()) {
				return new TypeRoom(res.getInt("id"), res.getString("name"), res.getString("image"),
						res.getInt("created_by"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void save(TypeRoom tr) {
		String sql = "insert into typeroom(name, image, created_by) values (?,?,?)";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, tr.getName());
			pre.setString(2, tr.getImage());
			pre.setInt(3, tr.getCreated_by());
			pre.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(TypeRoom tr) {
		String sql = "update typeroom set name = ?, image = ? where id = ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, tr.getName());
			pre.setString(2, tr.getImage());
			pre.setInt(3, tr.getId());
			pre.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteById(int id) {
		String sql = "delete from typeroom where id = ?";
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
	
	
	public static void main(String[] args) {
		TypeRoomDao typeRoomDao = new TypeRoomDao();
		
//		typeRoomDao.save(new TypeRoom("Căn hộ dịch vụ", "http", 1));
		typeRoomDao.findAll().forEach(p->{
			System.out.println(p);
		});
	}
}
