package com.frixie0.springboot.rest.example.springboot2jpaspringdatarest;

import com.frixie0.springboot.rest.example.springboot2jpaspringdatarest.student.StudentDataRestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2JpaWithHibernateAndH2Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentDataRestRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JpaWithHibernateAndH2Application.class, args);
	}

}
