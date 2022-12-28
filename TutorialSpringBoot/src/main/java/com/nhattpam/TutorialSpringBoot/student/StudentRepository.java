package com.nhattpam.TutorialSpringBoot.student;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
    //find by email 
    @Query("SELECT s From Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
