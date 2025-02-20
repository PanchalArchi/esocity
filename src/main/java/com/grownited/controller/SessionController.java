package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.UserEntity;
import com.grownited.repository.UserRepository;
import com.grownited.service.MailService;

@Controller
public class SessionController {
	@Autowired
	MailService serviceMail;
	
    @Autowired
	UserRepository repoUser;
	
    @Autowired
    PasswordEncoder encoder;
	
	@GetMapping ("signup")     // url name
	public String signup() {   //String name
		return "Signup";   //.jsp file name
	}
	
	@GetMapping (value = {"login","/"})     // url name
	public String login() {   //String name
		return "Login";   //.jsp file name
	}
	
	@PostMapping("savelogininfo")
	public String savelogininfo() {
		return "Home";
	}
	
	@PostMapping("saveuser")
	public String Saveuser(UserEntity entityUser) {
		String encPassword = encoder.encode(entityUser.getPassword());
		entityUser.setPassword(encPassword);
		repoUser.save(entityUser);
		
		entityUser.setRole("USER");
		repoUser.save(entityUser);
			
		//send mail 
		serviceMail.sendwelcomeMail(entityUser.getEmail(), entityUser.getFirstName());
		return "Login";
	}
	
	//open forget password jsp
	@GetMapping("forgetpassword")
	public String forgetPassword() {
		return "ForgetPassword";
	}
	
	//submit forget password jsp and open changepassword jsp
	@PostMapping("sendOtp")
	public String SendOtp() {
		return "ChangePassword";
	}
	
	//change password jsp and open login page
	@PostMapping("updatepassword")
	public String UpdatePassword() {
		return "Login";
	}
	
}