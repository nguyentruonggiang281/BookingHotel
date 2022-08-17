package com.res.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	public static Connection getConnect() {
		Connection connect = null;
		try {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlkhachsan", "root", "");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		return connect;
	}
	public static void main(String[] args) {
		System.out.println(getConnect());
	}
}
