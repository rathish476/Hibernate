package com.xworkz.speaker.dao;

import com.xworkz.speaker.dto.SpeakerDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SpeakerDAOImpl implements SpeakerDAO{

	public void save(SpeakerDTO speakerDTO) {
		//start the hibernate by creating obj of config
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(speakerDTO);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	

}