package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Passenger;
import dto.Train;

public class Traindao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Train saveTrain(Train train) {
		et.begin();
		em.persist(train);
		et.commit();
		
		return train;	
	}
	
	public Train updateTrain(int trainId, Train train) {
		et.begin();
		train.setTrainId(trainId);
		em.merge(train);
		et.commit();
		
		return train;	
	}
	
	
	
}
