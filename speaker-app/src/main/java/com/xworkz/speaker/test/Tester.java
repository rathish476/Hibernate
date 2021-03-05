package com.xworkz.speaker.test;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dao.SpeakerDAOImpl;
import com.xworkz.speaker.dto.SpeakerDTO;

public class Tester {

	public static void main(String[] args) {
		
     SpeakerDAO speakerDAO = new SpeakerDAOImpl();
		ServiceDAO servicedao=new ServiceDAOImpl(Speakerdao);
     SpeakerDTO speakerDTO = new SpeakerDTO(04,"realme",1500,"black","small",true);
	servicedao.validateAndsave(speakerDTO);
	}

}
