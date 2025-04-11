package com.javaproject.databaseconnectivity.spring_data_jpa.repository;

import com.javaproject.databaseconnectivity.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("Select s from student_sdj s where s.name=?1") // Query explanation?
    List<Student> findByNameUsingQuery(String name);

    List<Student> findByName(String name);
    List<Student> findByMarks(int marks);
    List<Student> findByMarksGreaterThan(int marks);
}
