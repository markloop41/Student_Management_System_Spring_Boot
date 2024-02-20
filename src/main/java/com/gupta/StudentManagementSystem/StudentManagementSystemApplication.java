package com.gupta.StudentManagementSystem;

import com.gupta.StudentManagementSystem.entity.Student;
import com.gupta.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;


	@Override
	public void run(String... args) throws Exception {

		/*
		Student s1 = new Student("Kunal","Gupta","guptakunal@gmail.com");
		studentRepository.save(s1);

		Student s2 = new Student("Manish","Choudhary","manish0414@gmail.com");
		studentRepository.save(s2);

		Student s3 = new Student("Ansh","Patel","patelansh000@gmail.com");
		studentRepository.save(s3);

		Student s4 = new Student("Piyush","Mishra","piyushmishra5151@gmail.com");
		studentRepository.save(s4);

		*/
	}
}
