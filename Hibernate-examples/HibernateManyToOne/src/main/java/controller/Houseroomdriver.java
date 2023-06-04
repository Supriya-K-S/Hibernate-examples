package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.RoomDao;
import dto.House;
import dto.Room;

public class Houseroomdriver {
public static void main(String[] args) {
		
		House house = new House();
		house.setHouseName("khans");
		house.setHouseNumber("598");
		house.setStreetNumber(10);
		
		Room room1 = new Room();
		room1.setNoofCupboards(1);
		room1.setNumberofWindows(2);
		room1.setRoomColor("green");
		room1.setHouse(house);
		
		Room room2 = new Room();
		room2.setNoofCupboards(2);
		room2.setNumberofWindows(1);
		room2.setRoomColor("blue");
		room2.setHouse(house);
		
		RoomDao roomDao = new RoomDao();
		System.out.println(roomDao.saveRoom(room1));
		System.out.println(roomDao.saveRoom(room2));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
		EntityManager em1 = emf.createEntityManager();
		em1.find(Room.class, 1);
		em1.find(Room.class, 1);
		
		
		EntityManager em2 = emf.createEntityManager();
		em2.find(Room.class, 1);
		
		
		
	}

}
