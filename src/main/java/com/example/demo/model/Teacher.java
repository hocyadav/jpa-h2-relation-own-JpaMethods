package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity 
@Data
public class Teacher {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int tid;
	private String tname;
	private String subject;
	@ManyToMany
	private Set<Class_> classes; 
}
