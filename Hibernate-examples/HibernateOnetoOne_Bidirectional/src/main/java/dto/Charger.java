package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Charger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int chargerId;
	private double chargerWatt;
	private String chargerType;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "charger")
	private Phone phone;
	public int getChargerId() {
		return chargerId;
	}
	public void setChargerId(int chargerId) {
		this.chargerId = chargerId;
	}
	public double getChargerWatt() {
		return chargerWatt;
	}
	public void setChargerWatt(double chargerWatt) {
		this.chargerWatt = chargerWatt;
	}
	public String getChargerType() {
		return chargerType;
	}
	public void setChargerType(String chargerType) {
		this.chargerType = chargerType;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Charger [chargerId=" + chargerId + ", chargerWatt=" + chargerWatt + ", chargerType=" + chargerType
				+ ", phone=" + phone + "]";
	}
	
	
	
}
