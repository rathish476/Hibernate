package com.xworkz.flight;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;



public class FlightTester {
public static void main(String[] args) {
		
		FlightDAO flightDAO=new FlightDAOImpl();
		FlightDTO flightDTO=new FlightDTO(3, "sun", "Bengaluru", "chikmagaluru", 80);
		
		//flightDAO.saveFlight(flightDTO);
		//flightDAO.updateFlight(3);
		flightDAO.readFlight(2);
		  //flightDAO.deleteFlight(4);
	}

}

