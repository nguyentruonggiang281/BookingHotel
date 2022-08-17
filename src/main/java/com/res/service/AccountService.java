package com.res.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.res.model.Account;

public class AccountService {

	public static Account getUserBySession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		Account account = (Account) session.getAttribute("login");
		return account;
	}
	
	public static String getRoleByUserLoged(HttpServletRequest req) {
		HttpSession session = req.getSession();
		Account account = (Account) session.getAttribute("login");
		return account.getRole();
	}
}
