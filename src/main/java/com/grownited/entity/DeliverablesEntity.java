package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="deliverables")
public class DeliverablesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deliverablesId;
	private Integer houseId;
	private Integer date;
	private Integer isPickup;
	public Integer getDeliverablesId() {
		return deliverablesId;
	}
	public void setDeliverablesId(Integer deliverablesId) {
		this.deliverablesId = deliverablesId;
	}
	public Integer getHouseId() {
		return houseId;
	}
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public Integer getIsPickup() {
		return isPickup;
	}
	public void setIsPickup(Integer isPickup) {
		this.isPickup = isPickup;
	}
	
	

	
}
