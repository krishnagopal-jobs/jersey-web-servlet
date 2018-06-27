package com.example;

import java.time.LocalDate;

public class Person {

	public Person() {
		this.firstName = "Kg";
		this.lastName = "Thogiti";
		this.dateOfBirth = LocalDate.of(1986, 7, 9);
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	private String firstName;

	private String lastName;

	private LocalDate dateOfBirth;

}
