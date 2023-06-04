package dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainId;
	private String trainName;
	private int trainNumberofCoaches;
	private String trainType;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "train")
	private List<Passenger> passengers;
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getTrainNumberofCoaches() {
		return trainNumberofCoaches;
	}
	public void setTrainNumberofCoaches(int trainNumberofCoaches) {
		this.trainNumberofCoaches = trainNumberofCoaches;
	}
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", trainName=" + trainName + ", trainNumberofCoaches="
				+ trainNumberofCoaches + ", trainType=" + trainType + ", passengers=" + passengers + "]";
	}
	
	
}
