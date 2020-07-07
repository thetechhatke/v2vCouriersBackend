package com.project.v2vcouriers.V2VCouriors.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.v2vcouriers.V2VCouriors.entity.User;

@Repository
public class UserJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> findAll()
	{
		return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
	}
}
