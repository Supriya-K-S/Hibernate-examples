package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Aadhar;

public class Aadhardao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Aadhar saveAadhar(Aadhar aadhar) {
		et.begin();
		em.persist(aadhar);
		et.commit();
		
		return aadhar;
	}
	
	public Aadhar findAadhar(int id) {
		et.begin();
		Aadhar aadhar = em.find(Aadhar.class,id);
		et.commit();
		
		return aadhar;	
	}
	
	public Aadhar deleteAadhar(int id) {
		et.begin();
		Aadhar aadhar = em.find(Aadhar.class, id);
		em.remove(aadhar);
		et.commit();
		
		return aadhar;
	}
	

}
