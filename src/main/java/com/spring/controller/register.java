package com.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.API.UserRegistrationDTO;

@Controller
public class register {

	@RequestMapping("/register")
	public String registermethode(@ModelAttribute("userregister") UserRegistrationDTO usrregDTo) {
		System.out.println("registermethode");
		return "register";
	}

	@RequestMapping("/registrationprocess")
	public String registerprocess(@Valid @ModelAttribute("userregister") UserRegistrationDTO usrregDTo,
			BindingResult resut) {
		if (resut.hasErrors()) {
			List<ObjectError> allErrors = resut.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
				return "register";
			}

		}
		System.out.println("registerprocess");
		return "registrationprocess";

	}

}
