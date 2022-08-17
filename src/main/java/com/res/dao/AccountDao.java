package com.res.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.res.connect.Connect;
import com.res.model.Account;

public class AccountDao {
	
	Connection conn;
	PreparedStatement pre = null;
	ResultSet res = null;
	
	public Account login(String phone, String password) {
		String sql = "select * from account where phone = ? and password = ?";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, phone);
			pre.setString(2, password);
			res = pre.executeQuery();
			if(res.next()) {
				return new Account(res.getInt("id"),res.getString("phone"), password, res.getString("password"), res.getString("role"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void save(Account ac) {
		String sql = "insert into account (phone, password, address) values (?,?,?)";
		conn = Connect.getConnect();
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, ac.getPhone());
			pre.setString(2, ac.getPassword());
			pre.setString(3, ac.getAddress());
			pre.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
