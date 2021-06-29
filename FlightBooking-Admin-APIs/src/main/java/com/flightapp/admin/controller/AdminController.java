package com.flightapp.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.admin.entities.AdminAccountModule;
import com.flightapp.admin.service.AdminService;
import com.flightapp.exception.FlightBookingAdminException;

@RestController
@RequestMapping(value = "/api/v1.0/admin")
@CrossOrigin(origins = "http://localhost:4200/")
public class AdminController {

	@Autowired
	private AdminService adminService;

	// create admin account
	@PostMapping(value = "/createAdminAccount")
	public boolean createAdminAccount(@RequestBody AdminAccountModule adminAccountModule) {

		boolean isSaved = false;
		try {
			isSaved = adminService.createAdminAccount(adminAccountModule);
			if (isSaved) {
			} else {
				System.out.println("Admin deatils failed to save in our record");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return isSaved;
	}

	// get Admin details here
	@GetMapping(value = "/getAdminDetails")
	public List<AdminAccountModule> getAdminDetails() throws FlightBookingAdminException {
		System.out.println("inside getAdminDetails");
		List<AdminAccountModule> adminDetailsResponse;
		adminDetailsResponse = adminService.getAdminDetails();
		return adminDetailsResponse;
	}

}// AdminController
