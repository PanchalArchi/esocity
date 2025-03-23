package com.grownited.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.grownited.entity.MemberEntity;
import com.grownited.repository.MemberRepository;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MemberController {
	@Autowired
	MemberRepository repoMember;
	
	@GetMapping("newmember")
	public String newMember() {
		return "NewMember";
	}
	
	@PostMapping("savemember")
	public String saveMember(MemberEntity entityMember) {	
		repoMember.save(entityMember);
		return "NewMember";
	}
	
	@GetMapping("listmembers")
	public String listMember(Model model) {
	    List<MemberEntity> memberList = repoMember.findAll(); // Fetch all data from the members table.
		
		//To send data from controller to jsp file.
		model.addAttribute("memberList", memberList);
						// (data_name  , data_value)
		
		return "ListMember";
	}
	
	@GetMapping("viewmember")
	public String viewMember(Integer memberId,Model model) {
		//?
		System.out.println("id ===>"+memberId);
	 Optional<MemberEntity> op = repoMember.findById(memberId);
	 if(op.isEmpty()) {
		 //not found
	 }else {
		 //data found
		 MemberEntity member = op.get();
		 //send data to jsp ->
		 model.addAttribute("member",member);
	 }
		return"ViewMember";
	}
	
	@GetMapping("deletemember")
	public String deleteMember(Integer memberId) {
		repoMember.deleteById(memberId);//delete from members where memberID = :memberId
		return "redirect:/listmember";
  }
	
}	
	


