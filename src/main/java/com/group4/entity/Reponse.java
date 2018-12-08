package com.group4.entity;

import java.util.UUID;

public class Reponse {
	private int id;
	private String name;
	private UUID uuId;

	public UUID getUuId() {
		return uuId;
	}

	public void setUuId(UUID uuId) {
		this.uuId = uuId;
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
