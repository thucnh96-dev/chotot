package com.group4.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City {
	@Id
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "city", fetch = FetchType.EAGER)
	List<Distric> districs;

	public List<Distric> getDistrics() {
		return districs;
	}

	public void setDistrics(List<Distric> districs) {
		this.districs = districs;
	}

	public City() {
		super();
	}

	public City(int id, String name) {
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
