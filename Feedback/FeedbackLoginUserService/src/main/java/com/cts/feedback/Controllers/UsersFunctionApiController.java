package com.cts.feedback.Controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.feedback.entity.User;
import com.cts.feedback.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-23T15:35:34.885+05:30[Asia/Calcutta]")
@Controller
public class UsersFunctionApiController implements UsersApi {

	private final ObjectMapper objectMapper;
	private final HttpServletRequest request;
	static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private UserRepository userRepository;

	@org.springframework.beans.factory.annotation.Autowired
	public UsersFunctionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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

	public Mono<ResponseEntity<User>> getByUserId(Integer userId) {
		return userRepository.findById(userId).map(user -> ResponseEntity.ok(user))
				.defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
	}

	public Flux<ResponseEntity<User>> allUsers() {
		return userRepository.findAll().map(user -> ResponseEntity.ok(user))
				.defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
	}

	public Mono<ResponseEntity<User>> addUser(@Valid @RequestBody User user) {
		return userRepository.save(user).map(savedUser -> new ResponseEntity<>(savedUser, HttpStatus.CREATED));
	}

	public Mono<ResponseEntity<Void>> removeUser(@PathVariable(value = "userId") String userId) {
		LOGGER.info("inside delete method");
		LOGGER.info(userId);
		return userRepository.delete(userId).then(Mono.just(ResponseEntity.ok().<Void>build()))
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}
}