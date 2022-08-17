package com.res.model;

import java.sql.Timestamp;

public class TypeRoom {

	private int id;
	
	private String name;
	
	private String image;
	
	private int created_by;

	public TypeRoom() {
		
	}

	public TypeRoom(String name, String image, int created_by) {
		this.name = name;
		this.image = image;
		this.created_by = created_by;
	}

	public TypeRoom(int id, String name, String image, int created_by) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.created_by = created_by;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	@Override
	public String toString() {
		return "TypeRoom [id=" + id + ", name=" + name + ", image=" + image + ", created_by=" + created_by + "]";
	}
	
}
