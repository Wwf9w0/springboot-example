package com.frixie0.springboot.rest.example.springboot2restservicecontentnegotiation.student;

public class StudentNotFoundException  extends RuntimeException{

    public StudentNotFoundException(String exception){
        super(exception);
    }
}
