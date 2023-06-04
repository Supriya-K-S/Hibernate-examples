package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Games;
import dto.Players;

public class Playerdao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Players savePlayer(Players player)
	{
		et.begin();
		em.persist(player);
		et.commit();
		return player;
	}
	
	public Games saveGame(Games game)
	{
		
		et.begin();
		em.persist(game);
		et.commit();
		return game;
	}
	
	public Players findPlayer(int playerId)
	{
//		et.begin();
//		et.commit();
		//is not neccessary because we are not doing any manupulations to data base, we are just fetching
		Players existingplayer = em.find(Players.class, playerId);
		
		return existingplayer;
	}
	public Players updatePlayer(Players player, int playerId)
	{
		Players existingplayer = findPlayer(playerId);
		if(existingplayer!= null)
		{
			et.begin();
			player.setPlayerId(playerId);
			et.commit();
			return player;
		}
		return null;
	}
	
	public Players deletePlayer(int playerid)
	{
		Players player= findPlayer(playerid);
			if(player!=null)
			{
				et.begin();
				em.remove(player);
				et.commit();
				return player;
			}
			return null;
			
	}

}
