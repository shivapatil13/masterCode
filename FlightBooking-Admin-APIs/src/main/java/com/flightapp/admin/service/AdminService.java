package com.flightapp.admin.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.admin.entities.AdminAccountEntity;
import com.flightapp.admin.entities.AdminAccountModule;
import com.flightapp.admin.mailservices.MailServiceProperties;
import com.flightapp.admin.mailservices.MailServices;
import com.flightapp.admin.repo.AdminRepository;
import com.flightapp.constant.FlightBookingAdminConstant;
import com.flightapp.constant.MailServicesConstant;
import com.flightapp.exception.FlightBookingAdminException;
import com.flightapp.exception.MailServiceException;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private MailServiceProperties mailServiceProp;
	@Autowired
	private MailServices mailServices;
	boolean isSaved = false;
	Logger log = LoggerFactory.getLogger(AdminService.class);

	public boolean createAdminAccount(AdminAccountModule adminAccountModule) throws FlightBookingAdminException {
		log.info(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_1);
		AdminAccountEntity adminAccountEntity = null;
		adminAccountEntity = new AdminAccountEntity();
		// copying from model to entity
		BeanUtils.copyProperties(adminAccountModule, adminAccountEntity);
		try {
			adminAccountEntity = adminRepository.save(adminAccountEntity);
			// check the condition
			if (adminAccountEntity.getAdminAccId() > 0) {
				/*
				 * call the mailing service function to send the mail resister admin
				 */
				sendAccCreationEmail(adminAccountModule);
				isSaved = true;
				log.info(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_2);
			} else {
				isSaved = false;
			}
		} // try
		catch (Exception e) {
			log.error(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_3);
			throw new FlightBookingAdminException();
		}
		return isSaved;

	}

	public List<AdminAccountModule> getAdminDetails() throws FlightBookingAdminException {
		log.info(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_5);
		List<AdminAccountModule> adminModuleList = new ArrayList<AdminAccountModule>();
		try {
			List<AdminAccountEntity> adminAccountEntity = adminRepository.findAll();
			adminAccountEntity.forEach(adminEntity -> {
				AdminAccountModule adminModule = new AdminAccountModule();
				BeanUtils.copyProperties(adminEntity, adminModule);
				adminModuleList.add(adminModule);
			});
			log.info(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_6);
		} catch (Exception e) {
			log.error(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_7);
			throw new FlightBookingAdminException();
		}
		return adminModuleList;
	}

	/*
	 * mail service function @date 19/06/2021
	 */
	private void sendAccCreationEmail(AdminAccountModule adminAccountModule) throws MailServiceException {
		String subject = mailServiceProp.getFlightAdminProp().get(MailServicesConstant.SEND_MAIL);
		String body = getEmailContentBody(adminAccountModule);
		try {
			mailServices.sendMailContentBody(adminAccountModule.getEmail(), subject, body);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * structuring mail body here in this function
	 */

	@SuppressWarnings("resource")
	private String getEmailContentBody(AdminAccountModule adminAccountModule) throws MailServiceException {
		// get file name
		String fileName = MailServicesConstant.FILE_NAME;
		StringBuilder sb = new StringBuilder();
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				// process the line
				if (line.equals("") || !line.contains("$")) {
					sb.append(line);
					line = br.readLine();
					continue;
				} // if
				if (line.contains("${FNAME}")) {
					line = line.replace("${FNAME}", adminAccountModule.getFirstName());
				}
				if (line.contains("${LNAME}")) {
					line = line.replace("${LNAME}", adminAccountModule.getLastName());
				}
				if (line.contains("${URL}")) {
					line = line.replace("URL", "<a href http://localhost:8484/\">www.flightbooking.com</a>");
				}
				if (line.contains("${EMAIL}")) {
					line = line.replace("${EMAIL}", adminAccountModule.getEmail());
				}
				if (line.contains("${PWD}")) {
					line = line.replace("${PWD}", adminAccountModule.getPassword());
				}
				if (line.contains("${ROLE}")) {
					line = line.replace("${ROLE}", adminAccountModule.getRole());
				}
				if (line.contains("${MOBILENUMBER}")) {
					line = line.replace("${MOBILENUMBER}", adminAccountModule.getMobileNumber());
				}
				// append the line in sb
				sb.append(line);
				line = br.readLine();
			} // while
		} // try
		catch (Exception e) {
			throw new MailServiceException();
		}
		return sb.toString();

	}

}// AdminService
