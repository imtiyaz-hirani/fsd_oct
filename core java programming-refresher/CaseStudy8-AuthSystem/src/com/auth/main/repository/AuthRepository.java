package com.auth.main.repository;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.auth.main.dto.SignUpDto;
import com.auth.main.model.User;

@Component
public class AuthRepository {

	private NamedParameterJdbcTemplate jdbc; 
	 
	@Autowired
	public void setDataSource(DataSource dataSource) {
		 this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public void signUp(SignUpDto dto) {
		String sql="insert into user(username,password,role) "
				+ " values (:username,:password,:role)";
		
		//map
		Map<String,Object> map = new HashMap<>();
		map.put("username",dto.getUsername());
		map.put("password",dto.getPassword());
		map.put("role","EMPLOYEE");
		
		//jdbc.update
		jdbc.update(sql, map);
		
		//fetch user_id by username
		String sql2="select id from user where username=:username";
		
		//map for sql2
		Map<String,Object> map2 = new HashMap<>();
		map2.put("username", dto.getUsername());
		
		//jdbc.query
		int id = jdbc.queryForObject(sql2, map2, Integer.class);
		
		//sql3 - employee insertion 
		String sql3="insert into employee(name,email,jobTitle,idCard,user_id) "
				+ " values (:name,:email,:jobTitle,:idCard,:user_id)";
		
		//map3 
		Map<String,Object> map3 = new HashMap<>();
		map3.put("name", dto.getName());
		map3.put("email", dto.getEmail());
		map3.put("jobTitle", dto.getJobTitle());
		map3.put("idCard", dto.getHasEmployeeId());
		map3.put("user_id", id);
		
		//jdbc.update
		jdbc.update(sql3, map3);
	}

	public Integer processLogin(String username, String password) {
		String sql="select id from user where username=:username AND password=:password";
		
		Map<String,Object> map = new HashMap<>();
		map.put("username",username);
		map.put("password",password);
		
		//jdbc.query
		int id = jdbc.queryForObject(sql, map, Integer.class);
		return id; 
	}

}
