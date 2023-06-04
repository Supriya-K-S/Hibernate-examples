package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.House;

public class HouseDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public House saveHouse(House house) {
		et.begin();
		em.persist(house);
		et.commit();
		return house;
	}
}
