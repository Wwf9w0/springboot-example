package com.frixie0.springboot.rest.example.springboot2restservicebasic.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> reriveAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student retriveStudent(@PathVariable Long id){

        Optional<Student> student = studentRepository.findById(id);

        if (!student.isPresent()){
            throw new StudentNotFoundException("id-" + id);
        }

        return student.get();
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
    }

    @PostMapping("'students")
    public ResponseEntity<Object> createStudent(@RequestBody Student student){

        Student savedStudent = studentRepository.save(student);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedStudent.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable Long id){

        Optional<Student> studentOptional = studentRepository.findById(id);

        if (!studentOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }

        student.setId(id);
        studentRepository.save(student);

        return ResponseEntity.noContent().build();

    }

}