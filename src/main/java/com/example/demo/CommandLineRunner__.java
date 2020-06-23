package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ClassDAO;
import com.example.demo.dao.TeacherDAO;
import com.example.demo.model.Class_;
import com.example.demo.model.Teacher;


@Component
public class CommandLineRunner__ implements CommandLineRunner{
	
	private static final Logger log_ = LoggerFactory.getLogger(CommandLineRunner__.class);
	
	@Autowired
	private TeacherDAO teacherDAO;
	
	@Autowired
	private ClassDAO classDAO;

	@Override
	public void run(String... args) throws Exception {
		log_.info("CommandLineRunner - Start");
		Class_ c1 = new Class_();
		c1.setCname("English");
		
		Class_ c2 = new Class_();
		c2.setCname("Physics");
		
		Class_ c3 = new Class_();
		c3.setCname("Maths");
		
		Class_ c4 = new Class_();
		c4.setCname("Maths");
		
		Set<Class_> cset1 = new HashSet();
		cset1.add(c1);
		cset1.add(c2);
		
		Set<Class_> cset2 = new HashSet();
		cset2.add(c2);
		cset2.add(c3);
		
		Set<Class_> cset3 = new HashSet();
		cset3.add(c1);
		cset3.add(c2);
		cset3.add(c3);
		cset3.add(c4);
		
		Teacher t = new Teacher();
		t.setTname("Jitendra Singh");
		t.setSubject("Maths");
		t.setClasses(cset1);
		
		Teacher t2 = new Teacher();
		t2.setTname("Phentom Sir");
		t2.setSubject("Physics");
		t2.setClasses(cset2);
		
		Teacher t3 = new Teacher();
		t3.setTname("Tiwari Mam");
		t3.setSubject("Chemistary");
		t3.setClasses(cset3);
		
		
		classDAO.save(c1);
		log_.info("class saved : "+c1);
		classDAO.save(c2);
		log_.info("class saved : "+c2);
		classDAO.save(c3);
		log_.info("class saved : "+c3);
		
//		
//		for(Class_ class_ : classDAO.findAll()) {
//			System.out.println(class_);
//		}
		
		teacherDAO.save(t);
		log_.info("teacher saved : "+t);
		teacherDAO.save(t2);
		log_.info("teacher saved : "+t2);
		teacherDAO.save(t3);
		log_.info("teacher saved : "+t3);
		
//		log_.info("printing all classes");
//		List<Teacher> findAll2 = teacherDAO.findAll();
//		System.out.println(findAll2);
//		
//		log_.info("CommandLineRunner - End");
	}

}
