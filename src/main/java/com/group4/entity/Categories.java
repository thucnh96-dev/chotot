package com.group4.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categories {
	@Id
	private UUID id;
	public UUID getId() {
		return id;
	}
	public Categories() {
		// TODO Auto-generated constructor stub
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	private String name;
	private String description;
	private String photo;
	@OneToMany(mappedBy="categoties")
	List<Categories> categoties;
}
