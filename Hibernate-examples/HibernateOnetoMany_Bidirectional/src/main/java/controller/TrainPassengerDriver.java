package controller;

import java.util.ArrayList;
import java.util.List;

import dao.Passengerdao;
import dao.Traindao;
import dto.Passenger;
import dto.Train;

public class TrainPassengerDriver {
	public static void main(String[] args) {

//		Passenger passenger1 = new Passenger();
//		passenger1.setPassengerName("ranjan");
//		passenger1.setPassengerAge(22);
//		passenger1.setPassengerNumber(48945955989l);
//		
//		Passenger passenger2 = new Passenger();
//		passenger2.setPassengerName("batman");
//		passenger2.setPassengerNumber(8845841858l);
//		passenger2.setPassengerAge(50);
//		
//		Train train = new Train();
//		train.setTrainName("vande bharat express");
//		train.setTrainNumberofCoaches(20);
//		train.setTrainType("Electric");
//		
//		List<Passenger> passengers = new ArrayList<Passenger>();
//		passengers.add(passenger1);
//		passengers.add(passenger2);
//		
//		passenger1.setTrain(train);
//		passenger2.setTrain(train);		
//		train.setPassengers(passengers);
//	
//		Traindao dao = new Traindao();
//		Train savedTrain = dao.saveTrain(train);
//		System.out.println(savedTrain);
//		
		// remove passenger from a train
		Traindao dao = new Traindao();
		Passengerdao dao1 = new Passengerdao();
		Passenger existingpass = dao1.getPassenger(2);

		Train passengerTrain = existingpass.getTrain(); // get train

		passengerTrain.getPassengers().remove(existingpass);

		dao.updateTrain(passengerTrain.getTrainId(), passengerTrain);

		System.out.println(dao1.deletePassenger(existingpass.getPassengerId()));

	}

}
