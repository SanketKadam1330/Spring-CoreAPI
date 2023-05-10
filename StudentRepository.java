package com.example.reposetery;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	
}
