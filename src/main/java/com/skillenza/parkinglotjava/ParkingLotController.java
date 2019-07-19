package com.skillenza.parkinglotjava;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:8080")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ParkingLotController {

	@Autowired
	ParkingServices Service;

	@GetMapping("/parkings")
	public List<ParkingLot> getParkingDetails() throws IOException {
		List<ParkingLot> result = Service.findAll();
		return result;
	}

	@PostMapping("/parkings")
	public List<ParkingLot> addParkingDetails(@Valid @RequestBody ParkingLot parkingLot, BindingResult result)
			throws IOException {
//		List<ParkingLot> objParkingLot=Service.findByVechileNo(parkingLot.getVehicleNumber());
		 Service.save(parkingLot);
		List<ParkingLot> list = Service.findAll();
		return list;
	}

}
