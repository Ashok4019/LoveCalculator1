package com.spring.API;

import java.util.Arrays;

import com.spring.annotation.Age;

public class UserRegistrationDTO {

	private String user;
	private String username;
	private char[] password;
	private String country;
	private String[] hobbies;
	private String gender;
	@Age(lower = 18, upper = 65)
	private Integer age;

	private CommunicationDTO communicationDTO;

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

	public UserRegistrationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserRegistrationDTO [user=" + user + ", username=" + username + ", password="
				+ Arrays.toString(password) + ", country=" + country + ", hobbies=" + Arrays.toString(hobbies)
				+ ", gender=" + gender + ", age=" + age + "]";
	}

}
