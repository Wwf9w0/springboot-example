package com.frixie0.springboot.rest.example.springboot2jdbcwithh2;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import student.Student;
import student.StudentJdbcRepository;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBoot2JdbcWithH2Application implements CommandLineRunner {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	//StudentJdbcRepository studentJdbcRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JdbcWithH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		/*logger.info("Student id 10001 -> {}", studentJdbcRepository.findById(10001L));
		logger.info("Inserting -> {}", studentJdbcRepository.insert(new Student(10010L, "John", "B12345123")));
		logger.info("Update 1003 -> {}", studentJdbcRepository.update(new Student(1000L, "Name-Updated", "New-Passport")));
		studentJdbcRepository.deleteById(10002L);

	    logger.info("All users -> {}", studentJdbcRepository.findAll());*/
	}
}
