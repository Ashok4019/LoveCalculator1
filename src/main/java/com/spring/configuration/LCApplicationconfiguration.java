package com.spring.configuration;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.formatter.Phoneformatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.spring")
public class LCApplicationconfiguration implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	// getting value in property file
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("message");
		return messageSource;

	}

	// getting value in property file
	@Bean(name = "validator")
	LocalValidatorFactoryBean validator() {

		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		return localValidatorFactoryBean;
	}

	// using formatter
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new Phoneformatter());

		System.out.println("view resoure addformatter");
	}

	// getting value in property file
	public org.springframework.validation.Validator getValidator() {
		return validator();

	}
	
	@Bean
	  public JavaMailSender getJavaMailSender() {
		  
		  JavaMailSenderImpl javaMailSenderImpl =new JavaMailSenderImpl();
		  javaMailSenderImpl.setHost("smtp.gmail.com");
		  javaMailSenderImpl.setUsername("ksashok63@gmail.com");
		  javaMailSenderImpl.setPassword("Ashok@ajith123");
		  javaMailSenderImpl.setPort(587);
		  
		  Properties mailProperties=new Properties();
		  mailProperties.put("mail.smtp.starttls.enable", true);
		  mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		  
		  javaMailSenderImpl.setJavaMailProperties(mailProperties);
		return javaMailSenderImpl;
		  
	  }

}
