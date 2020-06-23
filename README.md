# jpa-h2-relation-own-JpaMethods
Simple JPA H2 impl with own JPA relations + Custom JPA methods

### TeacherDAO interface extra methods

```java
public interface TeacherDAO extends JpaRepository<Teacher, Integer>{

	List<Teacher> findBySubject(String subject);  //find by Subject field + return list of Entity
	List<Teacher> findBySubjectIgnoreCase(String subject);
	List<Teacher> findBySubjectContaining(String subject);//Phy -> physics
	List<Teacher> findBySubjectIgnoreCaseContaining(String subject);//Best : Phy or phy-> physics
	
	List<Teacher> findByTnameContaining(String str);//find by name with correct substring : Jit -> Jitendra
	List<Teacher> findByTnameIgnoreCaseContaining(String str);//find by name with correct substring
}
```


### application.properties
	#h2
	spring.datasource.url=jdbc:h2:mem:h2db
	spring.h2.console.enabled=true
	spring.datasource.platform=h2

	#log - 2nd one is optional
	logging.level.com.com.example=debug
	logging.file.name=app.log

	#banner change
	spring.banner.location=bannername8.txt

	#sql 
	spring.jpa.show-sql=true
	spring.jpa.properties.hibernate.format_sql=true
