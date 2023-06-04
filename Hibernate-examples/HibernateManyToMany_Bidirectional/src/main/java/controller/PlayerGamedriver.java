package controller;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.Playerdao;
import dto.Games;
import dto.Players;

public class PlayerGamedriver {
public static void main(String[] args) {
//	Players player1 = new Players();
//	player1.setPlayerName("yam");
//	player1.setSchoolname("narayana");
//	
//	Players player2 = new Players();
//	player2.setPlayerName("raj");
//	player2.setSchoolname("chaitanya");
//	
//	Players player3 = new Players();
//	player3.setPlayerName("lakshan");
//	player3.setSchoolname("nalanda");
//	
//	Games game1 = new Games();
//	game1.setGameName("cricket");
//	game1.setGameType("outdoor");
//	
//	Games game2 = new Games();
//	game2.setGameName("football");
//	game2.setGameType("outdoor");
//	
//	Games game3 = new Games();
//	game3.setGameName("carrom");
//	game3.setGameType("indoor");
//	
//	List<Games> games1 = new ArrayList<Games>();
//	games1.add(game1);
//	games1.add(game2);
//	
//	List<Games> games2 = new ArrayList<Games>();
//	games2.add(game2);
//	games2.add(game3);
//	
//	List<Games> games3 = new ArrayList<Games>();
//	games3.add(game1);
//	games3.add(game3);
//	
//	player1.setGames(games1);
//	player2.setGames(games2);
//	player3.setGames(games3);
//	
//	List<Players> players1 = new ArrayList<Players>();
//	players1.add(player1);
//	players1.add(player3);
//	
//	List<Players> players2 = new ArrayList<Players>();
//	players2.add(player2);
//	players2.add(player1);
//
//
//	List<Players> players3 = new ArrayList<Players>();
//	players3.add(player3);
//	players3.add(player2);
//	
//	game1.setPlayers(players1);
//	game2.setPlayers(players2);
//	game3.setPlayers(players3);
//	
//	Playerdao dao = new Playerdao();
//	dao.savePlayer(player1);
//	dao.savePlayer(player2);
//	dao.savePlayer(player3);
//	dao.saveGame(game1);
//	dao.saveGame(game2);
//	dao.saveGame(game3);
	
	//secondary level caching
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
//	EntityManager em1 = emf.createEntityManager();
//	em1.find(Players.class, 1);
//	
//	
//	
//	EntityManager em2 = emf.createEntityManager();
//	em2.find(Players.class, 1);
//	
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
//	Query query = em.createQuery("update Players p set p.playerName='sagar' where p.playerId=1");
//	et.begin();
//	System.out.println(query.executeUpdate());
//	et.commit();
//	
	Query query1 = em.createQuery("select p from Players p"); // select * from players
	List<Players> allplayers = query1.getResultList();
	for(Players p : allplayers)
	{
		System.out.println(p.getPlayerName());
	}
	
	
}
}
