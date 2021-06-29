
package com.flightapp.admin.mailservices;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.flightapp.constant.MailServicesConstant;
import com.flightapp.exception.MailServiceException;

@Configuration
public class MailServices {

	@Autowired(required = true)
	public JavaMailSender javaMailSender;

	Logger log = LoggerFactory.getLogger(MailServices.class);

	public void sendMailContentBody(String to, String subject, String body) throws MailServiceException {
		log.info(MailServicesConstant.LOG_MAIL_SERVICE_1);
		MimeMessage message = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			// set the data
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body);
			helper.setSentDate(new Date());
			javaMailSender.send(message);
			log.info(MailServicesConstant.LOG_MAIL_SERVICE_2);
		} catch (Exception e) {
			log.error(MailServicesConstant.LOG_MAIL_SERVICE_3);
			throw new MailServiceException();

		}

	}

}
