package com.res.model;

import java.sql.Timestamp;

public class Invoice {

	private int id;
	
	private int account_id;
	
	private int room_id;
	
	private double price;
	
	private double total_price;
	
	private int numOfDay;
	
	private Timestamp start;
	
	private Timestamp end;
	
	private Timestamp createdDate;
	
	private Room room;

	public Invoice() {
	
	}

	public Invoice(int account_id, int room_id, double price, double total_price, int numOfDay) {
		this.account_id = account_id;
		this.room_id = room_id;
		this.price = price;
		this.total_price = total_price;
		this.numOfDay = numOfDay;
	}

	public Invoice(int id, int account_id, int room_id, double price, double total_price, int numOfDay) {
		this.id = id;
		this.account_id = account_id;
		this.room_id = room_id;
		this.price = price;
		this.total_price = total_price;
		this.numOfDay = numOfDay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public int getNumOfDay() {
		return numOfDay;
	}

	public void setNumOfDay(int numOfDay) {
		this.numOfDay = numOfDay;
	}

	public Timestamp getStart() {
		return start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Timestamp getEnd() {
		return end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", account_id=" + account_id + ", room_id=" + room_id + ", price=" + price
				+ ", total_price=" + total_price + ", numOfDay=" + numOfDay + ", start=" + start + ", end=" + end
				+ ", createdDate=" + createdDate + ", room=" + room + "]";
	}

	
	
	
}
