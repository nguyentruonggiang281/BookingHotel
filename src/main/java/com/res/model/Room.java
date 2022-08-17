package com.res.model;

public class Room {

	private int id;
	
	private String name;
	
	private double price;
	
	private String image;
	
	private int status;
	
	private int type_room_id;
	
	private String description;
	
	private TypeRoom typeRoom;

	public Room() {
		
	}

	public Room(String name, double price, String image, int status, int type_room_id, String description) {
		this.name = name;
		this.price = price;
		this.image = image;
		this.status = status;
		this.type_room_id = type_room_id;
		this.description = description;
	}

	public Room(int id, String name, double price, String image, int status, int type_room_id, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.status = status;
		this.type_room_id = type_room_id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType_room_id() {
		return type_room_id;
	}

	public void setType_room_id(int type_room_id) {
		this.type_room_id = type_room_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TypeRoom getTypeRoom() {
		return typeRoom;
	}

	public void setTypeRoom(TypeRoom typeRoom) {
		this.typeRoom = typeRoom;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", status=" + status
				+ ", type_room_id=" + type_room_id + ", description=" + description + "]";
	}
	
	
}
