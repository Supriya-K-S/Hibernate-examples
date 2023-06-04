package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Passenger;

public class Passengerdao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Passenger getPassenger(int passengerId) {
		et.begin();
		Passenger existingPassenger = em.find(Passenger.class, passengerId);
		et.commit();
		return existingPassenger;
	}
	public Passenger deletePassenger(int passengerId) {
		Passenger pass = getPassenger(passengerId);
		et.begin();
		em.remove(pass);
		et.commit();
		return pass;
		
	}
}
