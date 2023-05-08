/**
 * 
 */
package com.spring.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.spring.validator.Agevalidator;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = Agevalidator.class)

public @interface Age {
	String message() default "{Invalid.message}";

	int lower() default 18;

	int upper() default 60;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}