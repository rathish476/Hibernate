package com.xworkz.speaker.service;

import com.xworkz.speaker.dto.SpeakerDTO;

public interface SpeakerService {
	
	public boolean validateAndSave(SpeakerDTO dto);
        public boolean validateAndRead(SpeakerDTO dto);
	
	public boolean validateAndUpdate(SpeakerDTO dto);
	
	public boolean validateAndDelete(SpeakerDTO dto);
}
