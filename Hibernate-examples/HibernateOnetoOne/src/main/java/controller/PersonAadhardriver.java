package controller;

import dao.Aadhardao;
import dao.Persondao;
import dto.Aadhar;
import dto.Person;

public class PersonAadhardriver {
public static void main(String[] args) {
//	Aadhar aadhar = new Aadhar();
//	aadhar.setAadharNumber(878965856);
//	aadhar.setAddress("delhi");
//	
//	Person person = new Person();
//	person.setName("kaushik");
//	person.setNumber(7848498996l);
//	person.setAadhar(aadhar);
//	
//	// saving both aadhar and person using cascade type
//	Persondao personDao = new Persondao();
//	Person savedPerson = personDao.savePerson(person);
//	System.out.println(savedPerson);
	
	// set aadhar as null to a person to delete that aadhar
	
	Persondao personDao = new Persondao();
	Person person = personDao.findPerson(1);
	person.setAadhar(null);
	
	System.out.println(personDao.savePerson(person));
	
	//delete aadhar 
	
	Aadhardao aadharDao = new Aadhardao();
	Aadhar deletedAadhar = aadharDao.deleteAadhar(1);
	System.out.println(deletedAadhar);
	
	
	Persondao personDao1 = new Persondao();
	Person person1 = personDao1.deletePerson(2);
	System.out.println(person1);
	
	
	
}
}
