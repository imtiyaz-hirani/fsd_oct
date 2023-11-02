package com.auth.main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.auth.main.controller",
		"com.auth.main.service","com.auth.main.repository"})
public class ServletConfig implements WebMvcConfigurer{

	static {
		System.out.println("STEP 2. ServletConfig called..");
	}
	
	@Bean //-->Bean annotation is used to register the Information with spring during build
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = 
				new InternalResourceViewResolver(); 
		viewResolver.setPrefix("WEB-INF/jsps/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean //->register the Information with spring during build 
	public DataSource dbConnect() {
		String url="jdbc:mysql://localhost:3306/hex_fsd_oct_auth_c8";
		String username="root";
		String password="";
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	}
}
