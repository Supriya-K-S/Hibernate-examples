package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneId;
	private String phoneName;
	private int phoneRam;
	private String phoneOs;
	@OneToOne(cascade = CascadeType.ALL)
	private Charger charger;
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public int getPhoneRam() {
		return phoneRam;
	}
	public void setPhoneRam(int phoneRam) {
		this.phoneRam = phoneRam;
	}
	public String getPhoneOs() {
		return phoneOs;
	}
	public void setPhoneOs(String phoneOs) {
		this.phoneOs = phoneOs;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	
	
	
}
