package com.cts.feedback.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.feedback.entity.VolunteerUnRegistered;

import reactor.core.publisher.Mono;

@Repository
public interface VolunteerUnRegisteredRepository extends ReactiveCrudRepository<VolunteerUnRegistered, Integer> {
	
	@Query("SELECT * FROM volunteer_unreg WHERE employee_id = :empId")
	Mono<VolunteerUnRegistered> findByEmployeeId(String empId);

}
