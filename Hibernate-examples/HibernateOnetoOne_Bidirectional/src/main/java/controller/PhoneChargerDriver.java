package controller;

import dao.Chargerdao;
import dao.Phonedao;
import dto.Charger;
import dto.Phone;

public class PhoneChargerDriver {
public static void main(String[] args) {
//	Charger charger = new Charger();
//    charger.setChargerType("micro usb");
//	charger.setChargerWatt(10);
//	
//	Phone phone = new Phone();
//	phone.setPhoneName("Lava");
//	phone.setPhoneOs("Android");
//	phone.setPhoneRam(4);
//	phone.setCharger(charger);
//	
//	charger.setPhone(phone);
//	
//	Phonedao dao = new Phonedao();
//		Phone savedPhone = dao.savePhone(phone);
//	System.out.println(savedPhone);
	
	// fetch phone with charger id
//	Phonedao phonedao = new Phonedao();
//	Chargerdao chargerdao = new Chargerdao();
//	Charger existingcharger = chargerdao.findCharger(1);
//	Phone existingphone = existingcharger.getPhone();
//	System.out.println(existingphone.getPhoneName()+" "+existingphone.getPhoneOs()+" "+existingphone.getPhoneRam());
	
	//fetch charger with phone id
	Phonedao dao = new Phonedao();
	Phone existingPhone = dao.findPhone(1);
	System.out.println(existingPhone.getCharger());
}
}
