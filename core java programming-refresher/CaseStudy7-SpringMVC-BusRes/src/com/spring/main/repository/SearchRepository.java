package com.spring.main.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SearchRepository {

	private NamedParameterJdbcTemplate jdbc;

	// : connect to DataSource object that i registered with you during build
	// using @Bean annotation
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	public void fetchBuses(String source, String destination, String doj) {
		System.out.println(jdbc);
	}

}
