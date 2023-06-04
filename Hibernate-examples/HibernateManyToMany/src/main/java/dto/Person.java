package dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int personId;
  private String personName;
  private long personPhone;
  private String personCity;
  @ManyToMany(cascade= CascadeType.ALL)
  private  List<Language> languages;
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public long getPersonPhone() {
	return personPhone;
}
public void setPersonPhone(long personPhone) {
	this.personPhone = personPhone;
}
public String getPersonCity() {
	return personCity;
}
public void setPersonCity(String personCity) {
	this.personCity = personCity;
}
public List<Language> getLanguages() {
	return languages;
}
public void setLanguages(List<Language> languages) {
	this.languages = languages;
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + ", personPhone=" + personPhone
			+ ", personCity=" + personCity + ", languages=" + languages + "]";
}
  
  
  
}
