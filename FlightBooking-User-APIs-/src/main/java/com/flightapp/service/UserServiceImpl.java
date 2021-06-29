package com.flightapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.flightapp.exception.RecordNotFoundException;
import com.flightapp.model.UserDTO;
import com.flightapp.model.Users;
import com.flightapp.repo.UserRepo;
import com.flightapp.repo.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private PasswordEncoder bcryptEncoder;
	@Autowired
	private UserRepository userRepository;

	public Users createUser(Users user) {
		Users newUser;
		newUser = userRepo.save(user);
		return newUser;
	}

	public Users updateUser(Users user) {
		Users result;
		result = userRepo.save(user);
		return result;

	}

	public String deleteUser(Integer UserId) {
		Optional<Users> findUserById = userRepo.findById(UserId);
		if (findUserById.isPresent()) {
			userRepo.deleteById(UserId);
			return "User Deleted!!";
		} else
			throw new RecordNotFoundException("User not found for the entered UserID");
	}

	public List<Users> displayAllUser() {
		List<Users> userList;
		userList = userRepo.findAll();
		return userList;
	}

	public Optional<Users> getUserById(Integer id) {
		Optional<Users> userData;
		userData = userRepo.findById(id);
		return userData;

	}

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Users user = userRepository.findByUserName(userName);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + userName);
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getUserPassword(),
				new ArrayList<>());
	}
	
	public Users save(UserDTO user) {
		Users newUser = new Users();
		newUser.setUserName(user.getUserName());
		newUser.setUserPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepository.save(newUser);
	}

}
