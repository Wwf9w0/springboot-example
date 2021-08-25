package com.frixie0.springboot.rest.example.springboot2myBatiswithh2;

import com.frixie0.springboot.rest.example.springboot2myBatiswithh2.student.Student;
import com.frixie0.springboot.rest.example.springboot2myBatiswithh2.student.StudentMyBatisRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2MyBatisWithH2Application implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentMyBatisRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2MyBatisWithH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.info("Student id 10001 -> {}", repository.findById(10001L));
		log.info("Inserting -> {}", repository.insert(new Student(10010L, "John", "A123512312")));
		log.info("Update 10002 -> {}", repository.update(new Student(10001L, "Name-Updated", "New-Passport")));

		repository.deleteById(10002L);

		log.info("All users ->", repository.findAll());



	}
}
