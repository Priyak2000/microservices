package com.example.demo.service;

import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ResultClient resultClient;
    	
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentByRollNumber(String rollNumber) {
        return studentRepository.findByRollNumber(rollNumber);
    }
}

