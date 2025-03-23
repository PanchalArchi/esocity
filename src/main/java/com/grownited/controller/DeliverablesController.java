package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.DeliverablesEntity;
import com.grownited.entity.VehicleEntity;
import com.grownited.repository.DeliverablesRepository;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DeliverablesController {

	@Autowired
	DeliverablesRepository repoDeliverables;
	
	@GetMapping("adddeliverables")
	public String deliverables() {
		return "Deliverables";
		
	}
	
	@PostMapping("savedeliverables")
	public String savedeliverables(DeliverablesEntity entityDeliverables) {
		repoDeliverables.save(entityDeliverables);
		
		return "redirect:/adddeliverables";
	}
	
	@GetMapping("listdeliverables")
	public String listDeliverables(Model model) {
		List<DeliverablesEntity> listDeliverables = repoDeliverables.findAll(); // select *
		model.addAttribute("listDeliverables", listDeliverables);
		return "ListDeliverables";
	
	}
	

}
