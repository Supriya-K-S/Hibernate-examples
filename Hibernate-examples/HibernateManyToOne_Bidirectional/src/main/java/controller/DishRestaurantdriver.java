package controller;

import java.util.*;

import dao.Dishdao;
import dao.Restaurantdao;
import dto.Dish;
import dto.Restaurant;

public class DishRestaurantdriver {
	public static void main(String[] args) {
		
	
//	Dish dish1 = new Dish();
//	dish1.setDishName("paneer tikka");
//	dish1.setDishCost(200);
//	dish1.setDishCuisine("Indian");
//	
//	Dish dish2 = new Dish();
//	dish2.setDishName("Biryani");
//	dish2.setDishCuisine("Indian");
//	dish2.setDishCost(300);
//	
//	Dish dish3 = new Dish();
//	dish3.setDishName("Dal Makhani");
//	dish3.setDishCuisine("Punjabi");
//	dish3.setDishCost(200);
//	
//	Restaurant restaurant = new Restaurant();
//	restaurant.setRestName("Udupi");
//	restaurant.setRestNumber(84954854848l);
//	restaurant.setRestAdress("Bangalore");
//
//	
//	dish1.setRestaurant(restaurant);
//	dish2.setRestaurant(restaurant);
//	dish3.setRestaurant(restaurant);
//	
//	List<Dish> dishes = new ArrayList<Dish>();
//	dishes.add(dish1);
//	dishes.add(dish2);
//	dishes.add(dish3);
//	
//	restaurant.setDishes(dishes);
//	
//	Restaurantdao dao = new Restaurantdao();
//	dao.saveRestaurant(restaurant);
	
		//to delete dish from a restuarant
//	Restaurantdao restuarantdao = new Restaurantdao();
//	Dishdao dishdao = new Dishdao();
//	Dish existingdish = dishdao.findDish(2);
//	Restaurant existingrest = existingdish.getRestaurant();
//	existingrest.getDishes().remove(existingdish);
//	restuarantdao.updateRestaurant(existingrest,existingrest.getRestId());
//	
//	// to delete dish from table
//	existingdish.setRestaurant(null);
//	restuarantdao.deleteRestaurant(existingdish.getDishId());
//	
	Restaurantdao dao = new Restaurantdao();
	Restaurant res = dao.findRestaurant(1);
	System.out.println(res);
	// for fetchtype eager, all the associated relational entities will be loaded for above query
	
	// for fetchtype lazy, explicitly we have to fetch the details of associated relational entity
	List<Dish> dishes = res.getDishes();
	for(Dish dish : dishes) {
		
	System.out.println(dish.getDishName());
	}
	
  }
}
