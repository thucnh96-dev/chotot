package com.group4.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Adress {
	@Id
	private UUID id;
	private String adress;
	private String ward;
	private String distric;
	private String City;
	public UUID getId() {
		return id;
	}
	public Adress() {
		// TODO Auto-generated constructor stub
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getDistric() {
		return distric;
	}
	public void setDistric(String distric) {
		this.distric = distric;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@OneToMany(mappedBy="adress")
	List<Adress> adresss;

}
