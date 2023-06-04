package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Room {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	private int numberofWindows;
	private String roomColor;
	private int noofCupboards;
	@ManyToOne(cascade = CascadeType.ALL)
	private House house;
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getNumberofWindows() {
		return numberofWindows;
	}
	public void setNumberofWindows(int numberofWindows) {
		this.numberofWindows = numberofWindows;
	}
	public String getRoomColor() {
		return roomColor;
	}
	public void setRoomColor(String roomColor) {
		this.roomColor = roomColor;
	}
	public int getNoofCupboards() {
		return noofCupboards;
	}
	public void setNoofCupboards(int noofCupboards) {
		this.noofCupboards = noofCupboards;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", numberofWindows=" + numberofWindows + ", roomColor=" + roomColor
				+ ", noofCupboards=" + noofCupboards + ", house=" + house + "]";
	}
	
	
}
