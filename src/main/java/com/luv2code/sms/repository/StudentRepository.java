package com.luv2code.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
