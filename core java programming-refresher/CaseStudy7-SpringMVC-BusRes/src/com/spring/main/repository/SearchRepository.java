package com.spring.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.main.dto.SearchDto;

@Component
public class SearchRepository {

	private NamedParameterJdbcTemplate jdbc;

	// : connect to DataSource object that i registered with you during build
	// using @Bean annotation
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<SearchDto> fetchBuses(String source, String destination, String doj) {
		 String sql="select b.busNo, b.source, b.destination, v.name, bs.noOfHours, bs.doj, bs.fare " + 
		 		" from bus b, bus_schedule bs, vendor v " + 
		 		"where bs.bus_id=b.id AND b.vendor_id = v.id AND " + 
		 		"b.source=:source AND " + 
		 		"b.destination=:destination AND " + 
		 		"bs.doj=:doj";
		 
		 Map<String,String> map = new HashMap<>();
		 map.put("source", source);
		 map.put("destination", destination);
		 map.put("doj", doj);
		 
		 RowMapper<SearchDto> rowMapper = new RowMapper<SearchDto>() {

			@Override
			public SearchDto mapRow(ResultSet rst, int rowNum) throws SQLException {
				SearchDto dto = new SearchDto();
				dto.setBusNo(rst.getString("busNo"));
				dto.setSource(rst.getString("source"));
				dto.setDestination(rst.getString("destination"));
				dto.setBusOperatorName(rst.getString("name"));
				dto.setDoj(rst.getString("doj"));
				dto.setFare(rst.getDouble("fare"));
				dto.setNoOfHours(rst.getInt("noOfHours"));
				return dto;
			} 
		};
		 
		return jdbc.query(sql, map, rowMapper);
	}

}
