package com.xworkz.speaker.service;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dao.SpeakerDAOImpl;
import com.xworkz.speaker.dto.SpeakerDTO;

public class SpeakerServiceImpl implements SpeakerService {

	@Override
	public boolean validateAndSave(SpeakerDTO dto) {
private SpeakerDAO dao;

	public SpeakerServiceImpl(SpeakerDAO SpeakerDAO) {
		this.SpeakerDAO = dao;
	}

	@Override
	public boolean validateAndSaveSpeaker(SpeakerDTO dtO) {
		boolean validData = false;
		if (SpeakerDTO != null) {
			System.out.println("dto is not null, will validate fields");
			String brand = SpeakerDTO.getBrand();
			if (brand != null && brand.length() >= 2 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}
		
		if (validData) {
			String SpeakerSeriesName = SpeakerDTO.getSpeakerSeriesName();
			if (SpeakerSeriesName != null && SpeakerSeriesName.length() >= 4 && !SpeakerSeriesName.isEmpty()
					&& !SpeakerSeriesName.contains(" ")) {
				System.out.println("SpeakerSeriesName is valid");
				validData = true;
			} else {
				System.out.println("SpeakerSeriesName is invalid");
				validData = false;
			}

		}
		if (validData) {
			double price = SpeakerDTO.getPrice();
			if (price > 0) {
				System.out.println("price is valid");
				validData = true;
			} else {
				System.out.println("price is invalid");
				validData = false;
			}

		}
		if (validData) {
			String color = SpeakerDTO.getColor();
			if (color != null && color.length() >= 3 && !color.isEmpty() && !color.contains(" ")) {
				System.out.println("color is valid");
				validData = true;
			} else {
				System.out.println("color is invalid");
				validData = false;
			}
		}
		if (validData) {
			double batteryCapacity = mobileDTO.getBatteryCapacity();
			if (batteryCapacity > 0 && batteryCapacity <= 7000) {
				System.out.println("batteryCapacity is valid");
				validData = true;
			} else {
				System.out.println("batteryCapacity is invalid");
				validData = false;
			}

		}
		if (validData) {
			System.out.println("data is valid , can invoke mobiledao");
			SpeakerDAO.saveSpeaker(SpeakerDTO);
		} else {
			System.out.println("Speakerdto is null, invalid data");
		}
		}
		return false;
	}

	@Override
	public boolean validateAndRead(SpeakerDTO dto) {
		int SpeakerId=0;
		boolean validData = false;
		if (SpeakerDTO != null) {
			System.out.println("dto is not null, will validate fields");
		    SpeakerId=SpeakerDTO.getSpeakerId();
	        if(mSpeakerId > 0) {
			    System.out.println("SpeakerId is valid");
			    validData = true;
		    } else {
			    System.out.println("SpeakerId is invalid");
			    validData = false;
		}
		}if (validData) {
			System.out.println("data is valid , can invoke Speakerdao");
			SpeakerDAO.readSpeaker(SpeakerId);
		} else {
			System.out.println("Speakerdto is null, invalid data");
		}
		return false;
	}

	@Override
	public boolean validateAndUpdate(SpeakerDTO dto) {
		int SpeakerId=0;
		boolean validData = false;
		if (SpeakerDTO != null) {
			System.out.println("dto is not null, will validate fields");
		    SpeakerId=SpeakerDTO.getSpeakerId();
	        if(SpeakerId > 0) {
			    System.out.println("SpeakerId is valid");
			    validData = true;
		    } else {
			    System.out.println("SpeakerId is invalid");
			    validData = false;
		}
		}if (validData) {
			System.out.println("data is valid , can invoke mobiledao");
			SpeakerDAO.updateSpeaker(SpeakerId);
		} else {
			System.out.println("Speakerdto is null, invalid data");
		}
		return false;
	}

	@Override
	public boolean validateAndDelete(SpeakerDTO dto) {
		int SpeakerId=0;
		boolean validData = false;
		if (SpeakerDTO != null) {
			System.out.println("dto is not null, will validate fields");
		   SpeakerId=SpeakerDTO.getSpeakerId();
	        if(SpeakerId > 0) {
			    System.out.println("SpeakerId is valid");
			    validData = true;
		    } else {
			    System.out.println("SpeakerId is invalid");
			    validData = false;
		}
		}if (validData) {
			System.out.println("data is valid , can invoke mobiledao");
			SpeakerDAO.deleteSpeaker(SpeakerId);
		} else {
			System.out.println("Speakerdto is null, invalid data");
		}
		return false;
	}
}
