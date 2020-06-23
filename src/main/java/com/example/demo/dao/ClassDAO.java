package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Class_;

@Repository
public interface ClassDAO extends JpaRepository<Class_, Integer>{

}
