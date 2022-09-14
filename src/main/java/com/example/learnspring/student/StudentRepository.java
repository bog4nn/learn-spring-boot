package com.example.learnspring.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Data access layer
@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
    @Query("SELECT s FROM  Student s WHERE s.email= ?1")
    //SELECT * FROM student WHERE email = ?
    Optional<Student> findStudentByEmail(String email);
}
