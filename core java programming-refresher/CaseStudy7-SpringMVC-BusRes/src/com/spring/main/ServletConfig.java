package com.spring.main;

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
@ComponentScan(basePackages = {"com.spring.main.controller",
		"com.spring.main.service","com.spring.main.repository"})
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
		String url="jdbc:mysql://localhost:3306/hex_fsd_oct_c7";
		String username="root";
		String password="";
		DataSource dataSource = new DriverManagerDataSource(url, username, password);
		return dataSource;
	}
}
//WEB-INF/jsps/<name>.jsp
/* 
 * prefix: WEB-INF/jsps/
 * suffix: .jsp
 */