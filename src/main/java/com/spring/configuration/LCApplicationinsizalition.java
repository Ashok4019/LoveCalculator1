package com.spring.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCApplicationinsizalition extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = { LCApplicationconfiguration.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = { "/" };
		return arr;
	}

}
