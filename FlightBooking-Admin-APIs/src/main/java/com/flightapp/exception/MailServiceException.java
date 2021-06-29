
package com.flightapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.flightapp.admin.mailservices.MailServices;
import com.flightapp.constant.MailServicesConstant;

public class MailServiceException extends Exception {

	Logger log = LoggerFactory.getLogger(MailServices.class);
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public MailServiceException() {
		log.error(MailServicesConstant.LOG_MAIL_SERVICE_3);

	}

	MailServiceException(String msg) {
		log.error(MailServicesConstant.LOG_MAIL_SERVICE_3);

	}

}
