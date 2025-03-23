package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Visitor")
public class VisitorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer visitorId;
	private Integer houseId;
	private String purpose;
	private Integer date;
	private String allowed;
	private String visitorName;
	private Integer moblieNumber;
	private String profilePhoto;
	private Integer entryTime;
	private Integer exitTime;
	public Integer getVisitorId() {
		return visitorId;
	}
	public void setVisitorId(Integer visitorId) {
		this.visitorId = visitorId;
	}
	public Integer getHouseId() {
		return houseId;
	}
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public String getVisitorName() {
		return visitorName;
	}
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}
	public Integer getMoblieNumber() {
		return moblieNumber;
	}
	public void setMoblieNumber(Integer moblieNumber) {
		this.moblieNumber = moblieNumber;
	}
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	public Integer getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Integer entryTime) {
		this.entryTime = entryTime;
	}
	public Integer getExitTime() {
		return exitTime;
	}
	public void setExitTime(Integer exitTime) {
		this.exitTime = exitTime;
	}
	public String getAllowed() {
		return allowed;
	}
	public void setAllowed(String allowed) {
		this.allowed = allowed;
	}
	
	
}
