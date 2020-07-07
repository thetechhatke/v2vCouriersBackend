package com.project.v2vcouriers.V2VCouriors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.v2vcouriers.V2VCouriors.jdbc.UserJdbcDao;


@SpringBootApplication
public class V2VCouriorsApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserJdbcDao dao;
	
	public void setDao(UserJdbcDao dao) {
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication springApp = new SpringApplication(V2VCouriorsApplication.class);
		springApp.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Details: {}",dao.findAll());
	}
	

}
