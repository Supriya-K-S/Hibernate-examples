package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Charger;

public class Chargerdao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Charger findCharger(int chargerId)
	{
		et.begin();
		Charger charger = em.find(Charger.class, chargerId);
		et.commit();
		return charger;
	}

}
