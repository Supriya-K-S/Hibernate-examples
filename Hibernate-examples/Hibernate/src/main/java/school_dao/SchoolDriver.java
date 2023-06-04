package school_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import school.Student;

public class SchoolDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");;
	EntityManager em = emf.createEntityManager();
	EntityTransaction et  = em.getTransaction();
	Student s = new Student();
	s.setId(5);
	s.setName("avni");
	s.setGender("female");
	s.setNumber(55448846l);
	
	et.begin();
	em.persist(s);
	et.commit();
}
}
