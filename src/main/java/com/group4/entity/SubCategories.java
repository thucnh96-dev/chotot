package com.group4.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SubCategories {

	@Id
	private UUID id;
	private String name;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="category_id",nullable=false)
	private Categories categories;
	public SubCategories() {
		// TODO Auto-generated constructor stub
	}
	public UUID getId() {
		return id;
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
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
}
