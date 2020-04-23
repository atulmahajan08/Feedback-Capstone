package com.cts.feedback.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.feedback.entity.VolunteerRegistered;

import reactor.core.publisher.Mono;

@Repository
public interface VolunteerRegisteredRepository extends ReactiveCrudRepository<VolunteerRegistered, Integer> {
	
	@Query("SELECT * FROM volunteer_reg WHERE employee_id = :empId")
	Mono<VolunteerRegistered> findByEmployeeId(String empId);

}
