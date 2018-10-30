package com.group4.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Distric {
	@Id
	private int id;
	private String name;

	public Distric() {
		super();
	}

	public Distric(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
