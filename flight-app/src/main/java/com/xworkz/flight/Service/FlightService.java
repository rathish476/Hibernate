package com.xworkz.flight.Service;

import com.xworkz.flight.dto.FlightDTO;

public interface FlightService {
	
	
public boolean validateAndSaveFlight(FlightDTO flightDTO);
	
	public boolean validateAndReadFlight(FlightDTO flightDTO);
	
	public boolean validateAndUpdateFlight(FlightDTO flightDTO);
	
	public boolean validateAndDeleteFlight(FlightDTO flightDTO);
}
