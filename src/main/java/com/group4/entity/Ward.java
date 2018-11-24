package com.group4.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ward {
	@Id
	private int id;
	private String name;
	private String prefix;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id")
	private City city;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "distric_id")
	private Distric distric;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Distric getDistric() {
		return distric;
	}

	public void setDistric(Distric distric) {
		this.distric = distric;
	}

	public Ward() {
		super();
	}

	public Ward(int id, String name) {
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
