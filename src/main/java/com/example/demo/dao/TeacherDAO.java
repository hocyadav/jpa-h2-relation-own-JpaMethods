package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Teacher;

public interface TeacherDAO extends JpaRepository<Teacher, Integer>{
	
	List<Teacher> findBySubject(String subject);
	List<Teacher> findBySubjectIgnoreCase(String subject);
	List<Teacher> findBySubjectContaining(String subject);//Phy -> physics
	List<Teacher> findBySubjectIgnoreCaseContaining(String subject);//Best : Phy or phy-> physics
	
	List<Teacher> findByTnameContaining(String str);//find by name with correct substring : Jit -> Jitendra
	List<Teacher> findByTnameIgnoreCaseContaining(String str);//find by name with correct substring

}
