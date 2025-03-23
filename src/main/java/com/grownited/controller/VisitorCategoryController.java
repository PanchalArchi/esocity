package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grownited.entity.DeliverablesEntity;
import com.grownited.entity.VisitorCategoryEntity;
import com.grownited.repository.VisitorCategoryRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class VisitorCategoryController {
	@Autowired
	VisitorCategoryRepository repoVisitorCategory;

	@GetMapping("addvisitorcategory")
	public String visitorCategory() {
		return "Visitor_category";
	}
	
	@PostMapping("savevisitorcategory")
	public String savevisitorcategory(VisitorCategoryEntity entityVisitorCategory) {
		repoVisitorCategory.save(entityVisitorCategory);		
		return "redirect:/addvisitorcategory";
	}
	
	@GetMapping("listvisitorcategory")
	public String listvisitorcategory(Model model) {
		List<VisitorCategoryEntity> VisitorCategory = repoVisitorCategory.findAll(); // select *
		model.addAttribute("listVisitorCategory", VisitorCategory);
		return "ListVisitorcategory";
	
	}
	
}	