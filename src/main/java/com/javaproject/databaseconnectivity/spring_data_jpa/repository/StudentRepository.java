package com.javaproject.databaseconnectivity.spring_data_jpa.repository;

import com.javaproject.databaseconnectivity.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
