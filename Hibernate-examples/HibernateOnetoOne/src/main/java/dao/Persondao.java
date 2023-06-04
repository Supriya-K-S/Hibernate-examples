package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Person;

public class Persondao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Person savePerson(Person person) {
		et.begin();
		em.persist(person);
		et.commit();
		
		return person;
	}
	
	public Person findPerson(int id) {
		et.begin();
		Person person =  em.find(Person.class, id);
		et.commit();
		
		return person;
	}
	
	public Person deletePerson(int id) {
		et.begin();
		Person person = em.find(Person.class, id);
		em.remove(person);
		et.commit();
		
		return person;
	}
	

}
