package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Class_ {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int cid;
	private String cname;
	@ManyToMany
	private Set<Teacher> teachers;
}
