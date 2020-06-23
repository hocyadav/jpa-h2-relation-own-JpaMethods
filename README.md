# jpa-h2-relation-own-JpaMethods
Simple JPA H2 impl with own JPA relations + Custom JPA methods

```java
	List<Teacher> findBySubject(String subject);  //find by Subject field + return list of Entity
	List<Teacher> findBySubjectIgnoreCase(String subject);
	List<Teacher> findBySubjectContaining(String subject);//Phy -> physics
	List<Teacher> findBySubjectIgnoreCaseContaining(String subject);//Best : Phy or phy-> physics
  
	List<Teacher> findByTnameContaining(String str);//find by name with correct substring : Jit -> Jitendra
	List<Teacher> findByTnameIgnoreCaseContaining(String str);//find by name with correct substring

```
