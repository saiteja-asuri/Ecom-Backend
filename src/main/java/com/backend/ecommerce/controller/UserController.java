package com.backend.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ecommerce.model.User;
import com.backend.ecommerce.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/")
	public List<User> getAllUsers()
	{
		return this.userService.getAllUsers();
	}
	@GetMapping("/{userEmail}")
	public User getUser(@PathVariable String userEmail)
	{
		return this.userService.getUser(userEmail);
	}
	@PostMapping("/")
	public String addUser(@RequestBody User u) {
		return this.userService.addUser(u);
	}
	@PutMapping("/")
	public String updateUser(@RequestBody User u)
	{
		return this.userService.addUser(u);
	}
	@DeleteMapping("/{userEmail}")
	public String removeUser(@PathVariable String userEmail)
	{
		return this.userService.removeUser(userEmail);
	}
}
