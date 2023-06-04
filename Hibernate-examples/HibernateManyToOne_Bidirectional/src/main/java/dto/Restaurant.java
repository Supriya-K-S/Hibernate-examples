package dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restId;
	private String restName;
	private String restAdress;
	private long restNumber;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "restaurant",fetch = FetchType.EAGER)
	private List<Dish> dishes;
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getRestAdress() {
		return restAdress;
	}
	public void setRestAdress(String restAdress) {
		this.restAdress = restAdress;
	}
	public long getRestNumber() {
		return restNumber;
	}
	public void setRestNumber(long restNumber) {
		this.restNumber = restNumber;
	}
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	
	
	
	
}
