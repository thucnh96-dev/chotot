package com.group4.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Email;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.group4.validation.UniqueEmail;
import com.group4.validation.UniquePhone;
import com.group4.validation.UniqueUsername;
import com.group4.validation.UserNull;

//import org.hibernate.validator.constraints.Length;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 5242398560830588069L;
	@Id
	@Column(columnDefinition = "BINARY(16) NOT NULL")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty(value = "_id", access = JsonProperty.Access.READ_ONLY)
	private UUID id;
	@Column
	@UserNull(message = "${nameNull}")
	private String name;
	@Column(unique = true)
	@UniqueEmail(message="{emailisExist}")
	@Email(message = "{emailInvalid}")
	private String email;
	@Column(unique = true)
	@UniquePhone(message="{phoneisExist}")
	@UserNull(message = "{phoneNull}")
	private String phone;
	@UniqueUsername(message="{userNameisExist}")
	@Column(unique = true)
	private String username;
	@Column
	private boolean isActive = true;
	private String passsword;
	
	@Transient
	private String confimpassword;
	
	public String getPasssword() {
		return passsword;
	}


	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}


	public String getConfimpassword() {
		return confimpassword;
	}


	public void setConfimpassword(String confimpassword) {
		this.confimpassword = confimpassword;
	}
	private String token;
	public String getToken() {
		return token;
	}
	

	public void setToken(String token) {
		this.token = token;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_role",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role>roles;

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
    
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column
	private Timestamp createdAt;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="user",fetch = FetchType.EAGER)
	private List<Post> posts;
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createAt) {
		this.createdAt = createAt;
	}

}
