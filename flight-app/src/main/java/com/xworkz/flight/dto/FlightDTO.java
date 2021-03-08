package com.xworkz.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="speaker_db")
public class FlightDTO implements java.io.Serializable {
    
	@Column(name="FLIGHTID")
	@Id
	int flightId;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="LOCATION")
	String location;
	
	@Column(name="DESTINATION")
	String destination;
	
	@Column(name="TOTALSEATS")
	int totalseats;
	
	public FlightDTO(){
		
	}

	
	
	public FlightDTO(int flightId, String name, String location, String destination, int totalseats) {
		super();
		this.flightId = flightId;
		this.name = name;
		this.location = location;
		this.destination = destination;
		this.totalseats = totalseats;
	}



	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}

	@Override
	public String toString() {
		return "FlightDTO [flightId=" + flightId + ", name=" + name + ", location=" + location + ", destination="
				+ destination + ", totalseats=" + totalseats + "]";
	}

	
}
