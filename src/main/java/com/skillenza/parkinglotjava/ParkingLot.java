package com.skillenza.parkinglotjava;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "parkinglots")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class ParkingLot {

	// your code goes here
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "lot")
	private int lot;
	@Column(name = "created_at")
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	@Column(name = "parking_amount")
	private int parkingAmount;
	
	@Column(name = "parking_duration")
	private int parkingDuration;
	
	@Column(name = "vehicle_number")
	private int vehicleNumber;
	
	@Column(name = "updated_at")
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getLot() {
		return lot;
	}
	public void setLot(int lot) {
		this.lot = lot;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public int getParkingAmount() {
		return parkingAmount;
	}
	public void setParkingAmount(int parkingAmount) {
		this.parkingAmount = parkingAmount;
	}
	public int getParkingDuration() {
		return parkingDuration;
	}
	public void setParkingDuration(int parkingDuration) {
		this.parkingDuration = parkingDuration;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	


}
