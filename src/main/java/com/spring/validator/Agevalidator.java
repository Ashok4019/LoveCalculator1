package com.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.spring.annotation.Age;

public class Agevalidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;

	@Override
	public void initialize(Age age) {
		this.lower = age.lower();
		this.upper = age.upper();
		System.out.println("age validator");
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// write logic
		if (age == null) {
			return false;
		}
		if (age < lower || age > upper) {
			return false; // fail
		}
		return true; // pass
	}

}
