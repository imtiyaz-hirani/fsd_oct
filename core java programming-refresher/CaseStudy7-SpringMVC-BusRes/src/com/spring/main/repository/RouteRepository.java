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

import com.spring.main.dto.RouteDto;

@Component
public class RouteRepository {

	private NamedParameterJdbcTemplate jdbc; 
	 
	@Autowired
	public void setDataSource(DataSource dataSource) {
		 this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}


	public List<RouteDto> getAllRoutes() {
		 String sql="select b.id as bus_id,b.source, b.destination,"
		 		+ " v.name as bus_operator,v.city as operator_city,bs.noOfHours, "
		 		+ " bs.fare from bus b "
		 		+ " JOIN bus_schedule bs ON b.id=bs.bus_id "
		 		+ " JOIN vendor v ON b.vendor_id = v.id";
		 
		 RowMapper<RouteDto > rowMapper = new RowMapper<RouteDto>() {
 
			@Override
			public RouteDto mapRow(ResultSet rst, int rowNum) throws SQLException {
				RouteDto dto= new RouteDto();
				dto.setBus_id(rst.getInt("bus_id"));
				dto.setSource(rst.getString("source"));
				dto.setDestination(rst.getString("destination"));
				dto.setBus_operator(rst.getString("bus_operator"));
				dto.setOperator_city(rst.getString("operator_city"));
				dto.setNoOfHours(rst.getInt("noOfHours"));
				dto.setFare(rst.getDouble("fare"));
				return dto;
			}
			 
		};
		return jdbc.query(sql, rowMapper);
	}

}
