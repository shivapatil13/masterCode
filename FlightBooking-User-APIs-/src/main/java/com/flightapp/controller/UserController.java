package com.flightapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.model.Users;
import com.flightapp.service.UserServiceImpl;

@RestController
@RequestMapping(value = "/api/v1.0/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@PostMapping("/createUser")
	public Users addUser(@RequestBody Users newUser) {
		Users users;
		users = userService.createUser(newUser);
		return users;
	}

	@GetMapping("/readAllUsers")
	public List<Users> readAllUsers() {
		List<Users> userList;

		userList = userService.displayAllUser();
		return userList;
	}

	@PutMapping("/updateUser")
	public void updateUser(@RequestBody Users updateUser) {

		userService.updateUser(updateUser);
	}

	@DeleteMapping("/deleteUser/{id}")
	public void deleteBookingByID(@PathVariable("id") Integer userId) {

		userService.deleteUser(userId);
	}

	@GetMapping(value = "/getUserById/{id}")
	public Optional<Users> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);

	}

}
