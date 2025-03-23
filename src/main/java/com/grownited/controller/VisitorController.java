package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.grownited.entity.VisitorCategoryEntity;
import com.grownited.entity.VisitorEntity;
import com.grownited.repository.VisitorRepository;

import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class VisitorController {
	
	@Autowired
	VisitorRepository repoVisitor;
	@GetMapping("addvisitor")
	public String visitor() {
		return "Visitor";
		
	}
	
	@PostMapping("savevisitor")
	public String savevisitor(VisitorEntity entityVisitor) {
		repoVisitor.save(entityVisitor);
		
		return "redirect:/addvisitor";
	}
	
	@GetMapping("listvisitor")
	public String listvisitor(Model model) {
		List<VisitorEntity> listVisitor = repoVisitor.findAll(); // select *
		model.addAttribute("listVisitor", listVisitor);
		return "ListVisitor";
	
	
	}
	

}
