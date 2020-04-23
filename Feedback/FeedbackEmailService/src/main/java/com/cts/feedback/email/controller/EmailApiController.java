package com.cts.feedback.email.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.feedback.email.entity.VolunteerRegistered;
import com.cts.feedback.email.entity.VolunteerUnRegistered;
import com.cts.feedback.email.repository.VolunteerRegisteredRepository;
import com.cts.feedback.email.repository.VolunteerUnRegisteredRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.cts.feedback.email.entity.*;

import io.swagger.annotations.ApiParam;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-15T11:08:48.313+05:30[Asia/Calcutta]")
@Controller
public class EmailApiController implements EmailApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public EmailApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public Optional<ObjectMapper> getObjectMapper() {
		return Optional.ofNullable(objectMapper);
	}

	@Override
	public Optional<HttpServletRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@Autowired
	private VolunteerRegisteredRepository volunteerRegisteredRepository;
	@Autowired
	private VolunteerUnRegisteredRepository volunteerUnRegisteredRepository;

	@GetMapping("/sendEmail")
	public Mono<Boolean> sendEmail() {

		Email email = new Email();
		email.setFrom("atulmahajan@gmail.com");
		email.setSubject("Event Feedback");
		email.setText("Hi, We Request You to Provide feedback please click on below link");
		
		Flux<VolunteerRegistered> reg = volunteerRegisteredRepository.findAll();
		Flux<VolunteerUnRegistered> un_reg = volunteerUnRegisteredRepository.findAll();
		
		String[] reg_email = reg.filter(r -> r.getEmployeeId() != null).map(VolunteerRegistered::getEmployeeId)
				.collectList().block().stream().map(emailAdd -> emailAdd + "@gmail.com").toArray(String[]::new);

		String[] un_reg_email = un_reg.filter(r -> r.getEmployeeId() != null).map(VolunteerUnRegistered::getEmployeeId)
				.collectList().block().stream().map(emailAdd -> emailAdd + "@gmail.com").toArray(String[]::new);

		String[] arr = { "atulmahajan@gmail.com" };
		
		System.err.println(reg.map(r -> r.getEventId()).collectList());
		email.setTo(arr);

		try {
			send(email);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Mono<Boolean> sendEventEmail(
			@ApiParam(value = "email", required = true) @PathVariable("eventId") Integer eventId) {

		Email email = new Email();
		email.setFrom("atulmahajan@gmail.com");
		email.setSubject("Event Feedback");
		email.setText("Hi, We Request You to Provide feedback please click on below link");
		
		Flux<VolunteerRegistered> reg = volunteerRegisteredRepository.findByEventId(eventId);
		Flux<VolunteerUnRegistered> un_reg = volunteerUnRegisteredRepository.findByEventId(eventId);
		
		Flux<Long> arr1 = reg.filter(r -> r.getEmployeeId() != null).map(VolunteerRegistered::getEmployeeId);
		Flux<Long> arr2 = un_reg.filter(r -> r.getEmployeeId() != null).map(VolunteerUnRegistered::getEmployeeId);
		
		String[] emailArr = arr1.mergeWith(arr2).collectList().block().stream().map(emailAdd -> emailAdd + "@gmail.com")
				.toArray(String[]::new);

		email.setTo(emailArr);
		
		try {
			send(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Mono.just(Boolean.TRUE);
	}

	@Autowired
	private JavaMailSender javaMailSender;

	@Async
	public Boolean send(Email email) throws MailException, InterruptedException {
		System.err.println(email);
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(email.getFrom());
		simpleMailMessage.setTo(email.getTo());
		simpleMailMessage.setSubject(email.getSubject());
		simpleMailMessage.setText(email.getText());
		System.err.println(javaMailSender);
		javaMailSender.send(simpleMailMessage);
		return Boolean.TRUE;
	}
}
