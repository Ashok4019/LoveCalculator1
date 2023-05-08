package com.spring.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.API.UserDetailsDTO;

@Controller
@SessionAttributes("userinfo")
public class home {

	@RequestMapping("/home")
	public String display(Model model) {
		model.addAttribute("userinfo", new UserDetailsDTO());
		return "home";
	}

	@RequestMapping("/process")
	public String process(@Valid @ModelAttribute("userinfo") UserDetailsDTO userdetails, BindingResult result) {

		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {

			}
			return "home";
		}

		return "process";

	}
}
