package com.frixie0.springboot.rest.example.springboot2jpawithhibernateandh2.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
