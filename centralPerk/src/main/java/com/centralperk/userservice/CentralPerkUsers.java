package com.centralperk.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CentralPerkUsers {
	private UserService userService;

	@Autowired
	public CentralPerkUsers(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/addUser")
	public SignUpEntity addUsers(@RequestBody SignUpEntity userEntity) {
		return userService.addUser(userEntity);
	}
	@GetMapping("/signIn")
	public boolean login (@RequestParam String userName ,String password) {
		System.out.println(userName + password);
		return  userService.login(userName,password);
	}
	@GetMapping("/isAdmin")
	public boolean isAdmin(@RequestParam String userName ,String password) {
		return userService.isAdmin(userName, password);
	}
	
}
