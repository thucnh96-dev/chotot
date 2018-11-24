package com.group4.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Address {
	@Id
	@Column(columnDefinition = "BINARY(16) NOT NULL")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty(value = "_id", access = JsonProperty.Access.READ_ONLY)
	private UUID id;

	private String address;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ward_id")
	private Ward ward;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public Address() {
		super();
	}

}
