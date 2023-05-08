package com.spring.API;

public class Phone {
	private String countrycode;
	private String cnumber;

	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getCnumber() {
		return cnumber;
	}
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	@Override
	public String toString() {
		return getCountrycode()+"-"+getCnumber();
	}
	

}
