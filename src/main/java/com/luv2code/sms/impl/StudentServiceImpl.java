package com.luv2code.sms.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luv2code.sms.entity.Student;
import com.luv2code.sms.repository.StudentRepository;
import com.luv2code.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository StudentRepository;
    

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.StudentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
      return StudentRepository.findAll();
    }


    @Override
    public Student saveStudent(Student student) {

      return StudentRepository.save(student);
    }


    @Override
    public Student getStudentById(Long id) {
        return StudentRepository.findById(id).get();
    }


    @Override
    public Student updateStudent(Student student) {
      return StudentRepository.save(student);
  }


    @Override
    public void deleteStudentById(Long id) {
      StudentRepository.deleteById(id);
    }
    
    
}
