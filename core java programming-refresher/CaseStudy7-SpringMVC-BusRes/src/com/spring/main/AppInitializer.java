package com.spring.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	static {
		System.out.println("SETP 1. Dispatcher Servlet Loaded...");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?>[] classes = new Class[] {ServletConfig.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		String[] strArry = new String[] {"/"};
		return strArry;
	}

}
