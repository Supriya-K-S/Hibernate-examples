package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Phone;

public class Phonedao {
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Phone savePhone(Phone phone)
	{
		et.begin();
		em.persist(phone);
		et.commit();
		
		return phone;
	}
	public Phone findPhone(int phoneId)
	{
		et.begin();
		Phone phone = em.find(Phone.class, phoneId);
		et.commit();
		return phone;
	}
	

}
