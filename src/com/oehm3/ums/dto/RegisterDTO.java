package com.oehm3.ums.dto;
import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "register")
public class RegisterDTO implements Serializable{
	@Id
	@GenericGenerator(name = "r_auto", strategy = "increment")
	@GeneratedValue(generator = "r_auto")
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="contact_number")
	private Long contactNumber;
	@Column(name="password")
	private String password;
	
	public RegisterDTO() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
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

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "RegisterDTO [id=" + id + ", name=" + name + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", password=" + password + "]";
	}

}
