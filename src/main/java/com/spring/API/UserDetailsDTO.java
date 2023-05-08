package com.spring.API;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDetailsDTO {

	@NotBlank(message = "your name is not empty")
	@Size(min = 3, max = 15, message = "you name should have 3to 15")
	private String yourname;
	@NotBlank(message = "crush name is not empty")
	@Size(min = 3, max = 15, message = "you name should have 3to 15")
	private String crushname;
	@AssertTrue(message = "accpt term and condtion")
	private boolean terms;

	public UserDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getYourname() {
		return yourname;
	}

	public void setYourname(String yourname) {
		this.yourname = yourname;
	}

	public String getCrushname() {
		return crushname;
	}

	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}

	public boolean isTerms() {
		return terms;
	}

	public void setTerms(boolean terms) {
		this.terms = terms;
	}

	@Override
	public String toString() {
		return "UserDetailsDTO [yourname=" + yourname + ", crushname=" + crushname + ", terms=" + terms + "]";
	}

}
