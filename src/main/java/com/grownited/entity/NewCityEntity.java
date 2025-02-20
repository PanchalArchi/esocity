package com.grownited.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class NewCityEntity {
	
	@Id
	@GeneratedValue
	private Integer CityId;
	private String cityName;
	public Integer getCityId() {
		return CityId;
	}
    public void setCityId(Integer cityId) {
    	CityId = cityId;
    }
    public String getCityName() {
	    return cityName;
    }
    public void setCityName(String cityName) {
    	this.cityName = cityName;
    }
}
