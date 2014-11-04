package com.vocera.drools.fact;

import java.io.Serializable;

import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public class Patient implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2414980630057420677L;

	private String id;

	private String firstName;
	
	private String lastName;
	
	private LocalDate dateOfBirth;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String toString() {
		return "Patient( id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", dateOfBirth = " + dateOfBirth + ")";
	}
	
}
