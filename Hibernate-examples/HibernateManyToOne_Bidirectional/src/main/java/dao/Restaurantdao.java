package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Restaurant;

public class Restaurantdao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Restaurant saveRestaurant(Restaurant restaurant) {
		et.begin();
		em.persist(restaurant);
		et.commit();
		return restaurant;
	}
public Restaurant findRestaurant(int restaurantId) {
		
		Restaurant existingRestaurant = em.find(Restaurant.class, restaurantId);
		
		return existingRestaurant;
	}
public Restaurant deleteRestaurant(int RestId) {
	Restaurant existingRestaurant = findRestaurant(RestId);
	if(existingRestaurant!=null) {
		et.begin();
		em.remove(existingRestaurant);
		et.commit();
		return existingRestaurant;
	}
	return null;
}
	public Restaurant updateRestaurant(Restaurant restaurant , int restId){
		Restaurant existingrestaurant = findRestaurant(restId);
		if(existingrestaurant!= null)
		{
			et.begin();
			restaurant.setRestId(restId);
			et.commit();
			return restaurant;
		}
		return null;
	}
	
	

	
}
