package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Room;

public class RoomDao {
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("supriya");
	//EntityManagerFactory emf =  Persistence.createEntityManagerFactory(persistence-unit name);
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Room saveRoom(Room room)
	{
		et.begin();
		em.persist(room);
		et.commit();
		return room;
	}
	
	public  Room findRoom(int roomId)
	{
		Room existingRoom = em.find(Room.class, roomId);
		if(existingRoom!=null) {
			return existingRoom;
		}
		else {
			return null;
		}
	}
	public Room updateRoom(Room room, int roomId) {
		Room existingRoom = em.find(Room.class, roomId);
		if(existingRoom!=null) {
			room.setRoomId(roomId);
			et.begin();
			em.merge(room);
			et.commit();
			return room;
			
		}
		else {
			return null;
		}
	}
	
	public Room deleteRoom(int roomId) {
		Room existingRoom = em.find(Room.class, roomId);
		if(existingRoom!=null) {
			et.begin();
			em.remove(existingRoom);
			et.commit();
			return existingRoom;
		}else {
			System.out.println("no room present with the given room id");
			return null;
		}
	}
}

