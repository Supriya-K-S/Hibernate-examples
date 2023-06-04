package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Person;

public class PersonDao {
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("supriya");
	//EntityManagerFactory emf =  Persistence.createEntityManagerFactory(persistence-unit name);
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Person savePerson(Person person)
	{
		et.begin();
		em.persist(person);
		et.commit();
		
		return person;
	}
	
	public Person  findPerson(int personId)
	{
		et.begin();
		Person existingPerson = em.find(Person.class, personId);
		et.commit();
		return existingPerson;
	}
	
	public Person updatePerson(Person person,int personId)
	{
		Person existingPerson = findPerson( personId);
		if(existingPerson!=null)
		{
			et.begin();
			person.setPersonId(personId);
			em.merge(person);
			et.commit();
			return person;
			
		}
		else {
			return null;
		}
	}
}
