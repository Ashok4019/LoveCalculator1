package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.spring.API.EmailDTO;
import com.spring.API.UserDetailsDTO;
import com.spring.service.LCsendmailserviceimpl;

@Controller
public class Email {
	
	@Autowired
	private LCsendmailserviceimpl lcsendmailservice;

	@RequestMapping("/Email")
	public String emil(Model model) {
		model.addAttribute("emailDTO", new EmailDTO());
		return "Email";

	}

	@RequestMapping("/Emailprocess")
	public String emilprocess(@SessionAttribute("userinfo") UserDetailsDTO userdetails,
			@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		try {
		 
		lcsendmailservice.sendEmail(userdetails.getYourname(),emailDTO.getEmail(),"Friend");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Emailprocess";

	}

}
