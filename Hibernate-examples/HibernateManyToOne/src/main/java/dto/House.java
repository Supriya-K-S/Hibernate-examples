package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class House {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int houseId;
private String houseNumber;
private String houseName;
private int streetNumber;
public int getHouseId() {
	return houseId;
}
public void setHouseId(int houseId) {
	this.houseId = houseId;
}
public String getHouseNumber() {
	return houseNumber;
}
public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}
public String getHouseName() {
	return houseName;
}
public void setHouseName(String houseName) {
	this.houseName = houseName;
}
public int getStreetNumber() {
	return streetNumber;
}
public void setStreetNumber(int streetNumber) {
	this.streetNumber = streetNumber;
}
@Override
public String toString() {
	return "House [houseId=" + houseId + ", houseNumber=" + houseNumber + ", houseName=" + houseName + ", streetNumber="
			+ streetNumber + "]";
}
	
	
}
