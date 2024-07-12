package com.luv2code.sms.services;

import java.util.*;

import com.luv2code.sms.entity.Student;

public interface StudentService {


    List<Student> getAllStudents();

    Student saveStudent(Student student);
    
    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
