package com.xworkz.flight.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.flight.dto.FlightDTO;

public class FlightDAOImpl implements FlightDAO {

	public void saveFlight(FlightDTO flightDTO) {
		Session session = null;
		try{
			session = new Configuration().configure().buildSessionFactory().openSession();
		    Transaction transaction=session.beginTransaction();
		    session.save(flightDTO);
		    transaction.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}		
	}

	public void readFlight(int flightId) {
		Session session = null;
		try{
			session = new Configuration().configure().buildSessionFactory().openSession();
		    FlightDTO flightDTO=session.get(FlightDTO.class, flightId);
		    System.out.println(flightDTO);
		}catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}		
	}

	public void updateFlight(int flightId) {
		Session session = null;
		try{
			session = new Configuration().configure().buildSessionFactory().openSession();
		    FlightDTO flightDTO=session.get(FlightDTO.class, flightId);
		    flightDTO.setLocation("Bengaluru");
		    Transaction transaction=session.beginTransaction();
		    session.update(flightDTO);
		    transaction.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteFlight(int flightId) {
		Session session = null;
		try{
			session = new Configuration().configure().buildSessionFactory().openSession();
		    FlightDTO flightDTO=session.get(FlightDTO.class, flightId);
		    Transaction transaction=session.beginTransaction();
		    session.delete(flightDTO);
		    transaction.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}

}
