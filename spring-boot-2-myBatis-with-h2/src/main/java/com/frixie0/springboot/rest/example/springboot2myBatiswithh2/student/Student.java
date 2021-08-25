package com.frixie0.springboot.rest.example.springboot2myBatiswithh2.student;

public class Student {

    private Long id;
    private String name;
    private String passportNumber;

    private Student(){
        super();
    }

    public Student(Long id, String name, String passportNumber){
        super();
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;

    }

    public Student(String name, String passportNumber){
        super();
        this.name = name;
        this.passportNumber = passportNumber;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
