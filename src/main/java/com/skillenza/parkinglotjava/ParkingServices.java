package com.skillenza.parkinglotjava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingServices {
	@Autowired
	ParkingLotRepository lotRepository;
//	 @Autowired
//	    private SessionFactory sessionFactory;
//	 
//	    protected Session getSession(){
//	        return sessionFactory.getCurrentSession();
//	    }
//	private  ParkingLotRepository repository;

	public List<ParkingLot> findAll() {
		return lotRepository.findAll();
	}

	public ParkingLot save(ParkingLot parkingLot) {
		return lotRepository.save(parkingLot);
	}

//	public List<ParkingLot> findByVechileNo(int vehicleNumber) {
//		
//		@SuppressWarnings("deprecation")
//		Criteria criteria = getSession().createCriteria(ParkingLot.class);
//		criteria.add(Restrictions.like("vehicleNumber", vehicleNumber));
//		return criteria.list();
//	}

}
