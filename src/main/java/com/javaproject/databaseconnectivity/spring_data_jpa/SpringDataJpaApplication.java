package com.javaproject.databaseconnectivity.spring_data_jpa;

import com.javaproject.databaseconnectivity.spring_data_jpa.model.Student;
import com.javaproject.databaseconnectivity.spring_data_jpa.repository.StudentRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

//		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(101);
//		s1.setName("Rohit");
//		s1.setMarks(90);
//
		s2.setRollNo(102);
		s2.setName("Mohit");
		s2.setMarks(70);
//
//		s3.setRollNo(103);
//		s3.setName("Rakesh");
//		s3.setMarks(95);
//
////		Save Objects
//		studentRepository.save(s1);
//		studentRepository.save(s2);
//		studentRepository.save(s3);

////        Find all records
//		System.out.println(studentRepository.findAll());

////        Find record by id
//		Optional<Student> student_1 = studentRepository.findById(103);
//		System.out.println(student_1);
//		Optional<Student> student_2 = studentRepository.findById(104);
//		System.out.println(student_2.orElse(null));

////		Find record by specific parameter
//		System.out.println(studentRepository.findByNameUsingQuery("Rohit"));
//		System.out.println(studentRepository.findByName("Mohit"));
//		System.out.println(studentRepository.findByMarks(80));
//		System.out.println(studentRepository.findByMarksGreaterThan(80));

////		Update and delete data
		studentRepository.save(s2); // update
		studentRepository.delete(s2); // delete
	}

}
