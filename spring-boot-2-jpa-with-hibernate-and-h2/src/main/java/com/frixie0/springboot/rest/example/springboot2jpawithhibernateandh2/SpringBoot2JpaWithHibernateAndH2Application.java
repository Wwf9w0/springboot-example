package com.frixie0.springboot.rest.example.springboot2jpawithhibernateandh2;

import com.frixie0.springboot.rest.example.springboot2jpawithhibernateandh2.student.Student;
import com.frixie0.springboot.rest.example.springboot2jpawithhibernateandh2.student.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2JpaWithHibernateAndH2Application implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JpaWithHibernateAndH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.info("Student id 10001 -> {}",  repository.findById(10001L));
		log.info("Inserting -> {}", repository.save(new Student("John", "A123123")));
		log.info("Update 10003 -> {}", repository.save(new Student(10001L, "New-Updated", "New-Passport")));
		repository.deleteById(1002L);

		log.info("All users -> {}", repository.findAll());

	}
}
