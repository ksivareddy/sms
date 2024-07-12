package com.luv2code.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luv2code.sms.entity.Student;
import com.luv2code.sms.repository.StudentRepository;

@SpringBootApplication
public class SmsApplication
//  implements CommandLineRunner
 
 {
    @Autowired
	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

	// @Autowired
	// private StudentRepository studentRepository;

	// @Override
	// public void run(String... args) throws Exception {
	// 	Student student1 = new Student("Siva", "Reddy K", "Siva@gmail.com");
	// 	studentRepository.save(student1);
	// 	Student student2 = new Student("Guna", "Sekhar", "guna@gmail.com");
	// 	studentRepository.save(student2);
	// 	Student student3 = new Student("venki", "C", "venki@gmail.com");
	// 	studentRepository.save(student3);
	// }

}
