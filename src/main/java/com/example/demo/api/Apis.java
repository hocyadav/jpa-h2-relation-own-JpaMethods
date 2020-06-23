package com.example.demo.api;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ClassDAO;
import com.example.demo.dao.TeacherDAO;
import com.example.demo.model.Class_;
import com.example.demo.model.Teacher;

@RestController
@RequestMapping("/class")
public class Apis {

	@Autowired
	ClassDAO classDao;
	
	@Autowired
	TeacherDAO teacherDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Class_> getAll() {
		return classDao.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveStudent(@RequestBody Class_ class_) {
		Set<Teacher> tset = new HashSet();
		
		Teacher t = new Teacher();
		t.setSubject("maths");
		t.setTname("jitendra sir");
		
		teacherDAO.save(t);
		tset.add(t);
		
		class_.setTeachers(tset);
		
		classDao.save(class_);
	}
	
	@RequestMapping(value = "/te", method = RequestMethod.GET)
	public List<Teacher> getAllSubh() {
		return teacherDAO.findAll();
	}
	
	//all working
	@RequestMapping(value = "/te/{subj}", method = RequestMethod.GET)
	public List<Teacher> getByMaths(@PathVariable("subj") String subj) {
		//return teacherDAO.findBySubject(subj);//Maths, Physics
		//return teacherDAO.findBySubjectIgnoreCase(subj);//Maths/maths, Physics/physics
		//return teacherDAO.findBySubjectContaining(subj);//Mat, Phy
		return teacherDAO.findBySubjectIgnoreCaseContaining(subj);//mat, phy
		
		//return teacherDAO.findByTnameIgnoreCaseContaining(subj);
	}
	
	
	@RequestMapping(value = "/te", method = RequestMethod.POST)
	public void saveSubj(@RequestBody Teacher tea_) {
		Set<Class_> cset = new HashSet();
		
		Class_ c = new Class_();
		c.setCname("eng class");
		classDao.save(c);
		
		cset.add(c);
		
		teacherDAO.save(tea_);
	}
	
}
