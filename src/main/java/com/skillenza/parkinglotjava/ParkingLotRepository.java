package com.skillenza.parkinglotjava;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long> {
//	ParkingLot findByVehicle(int vehicleNumber);
//	List<ParkingLot> findByVehicle(int vehicleNumber);

}
