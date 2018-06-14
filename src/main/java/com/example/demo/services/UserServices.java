package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repositories.UserRepository;

@RestController
public class UserServices {
	
	@Autowired
	UserRepository userRepository;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public String sayHello() {
		return "Another hi from Sanket ";
	} 
	
	@RequestMapping("/create")
	@ResponseBody
	public String create() {
		Users user = new Users();
		user.setAddress("Home");
		user.setName("sanket");
		userRepository.save(user);
		return "user created in database";
	}
	
	@RequestMapping("/all")
	@ResponseBody
	public List<Users> findAll() {
		return (List<Users>) userRepository.findAll();
	}

}
