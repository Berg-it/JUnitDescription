package com.bergit.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	//@Id
	@Column(name="EMAIL",nullable=false,length=20)
	private String email;
	
	//@Id
	@Column(name="LOGIN",nullable=false,length=20)
	private String login;
	
	@Column(name="PASSWORD",nullable=false,length=20)
	private String password;
	
	@Column(name="FIRSTNAME",nullable=false,length=20)
	private String firstname;

	@Column(name="LASTNAME",nullable=false,length=20)
	private String lastname;
	
	@Column(name="TELEPHONE",nullable=false)
	private String telephone;
	
	@Column(name="idPictureProfile")
	private String idPictureProfile;
	
	@Column(name="ROLE")
	private String role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getIdPictureProfile() {
		return idPictureProfile;
	}

	public void setIdPictureProfile(String idPictureProfile) {
		this.idPictureProfile = idPictureProfile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	

}
