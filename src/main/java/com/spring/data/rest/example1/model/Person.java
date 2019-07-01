package com.spring.data.rest.example1.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private long id;

	private String firstName;
	private String lastName;

	@ManyToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinTable(name = "person_address", joinColumns = { @JoinColumn(name = "person_id",referencedColumnName = "person_id") }, inverseJoinColumns = {
			@JoinColumn(name = "address_id",referencedColumnName = "address_id") })
	private Set<Address> addresses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Address> getAddress() {
		return addresses;
	}

	public void setAddress(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + addresses
				+ "]";
	}

}
