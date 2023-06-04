package dto;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Cacheable
public class Players {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	private String playerName;
	private String schoolname;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "players")
	private List<Games> games;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public List<Games> getGames() {
		return games;
	}
	public void setGames(List<Games> games) {
		this.games = games;
	}
	@Override
	public String toString() {
		return "Players [playerId=" + playerId + ", playerName=" + playerName + ", schoolname=" + schoolname
				+ ", games=" + games + "]";
	}
	
	
}
