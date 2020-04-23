package com.cts.feedback.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.feedback.entity.Question;
import com.cts.feedback.repository.QuestionsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-02T10:12:15.768+05:30[Asia/Calcutta]")
@Controller
public class AddQuestionApiController implements AddQuestionApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public AddQuestionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
	private QuestionsRepository questionsRepository;

	public Mono<ResponseEntity<Question>> addQuestion(@Valid @RequestBody Question question)
	{
		return questionsRepository.save(question)
				.map(savedQuestion -> new ResponseEntity<>(savedQuestion, HttpStatus.CREATED));
	}
}
