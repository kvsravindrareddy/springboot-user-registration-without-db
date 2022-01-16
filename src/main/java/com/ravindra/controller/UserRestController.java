package com.ravindra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravindra.data.UserData;
import com.ravindra.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/createuser")
	public void createUser(@RequestBody UserData userData)
	{
		userService.createService(userData);
	}
	
	@GetMapping("/getuser")
	public UserData findByUserName(@RequestParam String userName)
	{
		return userService.findByUserName(userName);
	}
}