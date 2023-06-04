package controller;

import java.util.ArrayList;
import java.util.List;

import dao.PersonDao;
import dto.Language;
import dto.Person;

public class PersonLanguageDriver {
public static void main(String[] args) {
	Language language1 = new Language();
	language1.setLanguageName("hindi");
	language1.setLanguageOrigin("India");
	
	Language language2 = new Language();
	language2.setLanguageName("sanskrit");
	language2.setLanguageOrigin("South Asia");
	
	Language language3 = new Language();
	language3.setLanguageName("German");
	language3.setLanguageOrigin("Germany");
	
	Person person1 = new Person();
	person1.setPersonName("rohit");
	person1.setPersonCity("ranchi");
	person1.setPersonPhone(6775576l);
	
	// created a list of languages spoken by person 1
	List<Language> languages1 = new ArrayList<Language>();
	languages1.add(language1);
	languages1.add(language2);
	
	person1.setLanguages(languages1);
	
	Person person2 = new Person();
	person1.setPersonName("raj");
	person1.setPersonCity("rajastan");
	person1.setPersonPhone(67755765665l);
	
	// created a list of languages spoken by person 2
	List<Language> languages2 = new ArrayList<Language>();
	languages2.add(language3);
	languages2.add(language1);
	
	person2.setLanguages(languages2);
	
	PersonDao personDao = new PersonDao();
	System.out.println(personDao.savePerson(person1));
	System.out.println(personDao.savePerson(person2));
	
}
}
