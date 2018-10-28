package com.group4.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class User {
	@Id
	private UUID id;
	
	private String name;
	private String username;
	private String email;
	private String password;
	private boolean isActive;
	private Timestamp createAt;
	
	@ManyToMany
	@JoinTable(name="user_role",
	joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="user_role"))
	private List<Role> roles;
	
	@OneToMany(mappedBy="user")
	List<Post> posts;

	 public User() {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Timestamp getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Transient
	public String getPasswordConfirm() {
		return this.password;
	}
	
	
}
