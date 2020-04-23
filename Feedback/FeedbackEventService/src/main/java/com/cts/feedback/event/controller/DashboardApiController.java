package com.cts.feedback.event.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.cts.feedback.event.entity.*;

import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-21T12:07:42.313+05:30[Asia/Calcutta]")
@Controller
public class DashboardApiController implements DashboardApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public DashboardApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
	private DatabaseClient databaseClient;

	@Override
	public Mono<ResponseEntity<Dashboard>> getDashboard() {
		return databaseClient
				.execute(
						"select count(*) as total_events ,sum(lives_impacted) as lives_impacted, sum(total_no_of_volunteers) as total_volunteers , sum(total_no_of_volunteers) as total_participants from event")
				.as(Dashboard.class).fetch().first().map(dashboard -> ResponseEntity.ok(dashboard))
				.defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();

	}

}
