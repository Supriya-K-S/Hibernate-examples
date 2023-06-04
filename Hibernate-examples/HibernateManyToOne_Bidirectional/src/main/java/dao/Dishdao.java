package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Dish;
import dto.Restaurant;

public class Dishdao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
public Dish findDish(int dishId) {
		
		Dish  existingdish = em.find(Dish.class, dishId);
		
		return existingdish;
	}

}
