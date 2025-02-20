package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.NewCityEntity;
import com.grownited.repository.CityRepository;

@Controller
public class NewCityController {
	@Autowired
	CityRepository repoCity;
	
	@GetMapping("newcity")
    public String newcity() {
		return "NewCity";	
	}
	
	@PostMapping("savecity")
	public String saveCity(NewCityEntity entityCity) {
		System.out.println(entityCity.getCityName());
		repoCity.save(entityCity);
		return "NewCity";
		
	}
}
