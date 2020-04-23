package com.cts.feedback.email.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.feedback.email.entity.VolunteerRegistered;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface VolunteerRegisteredRepository extends ReactiveCrudRepository<VolunteerRegistered, Integer> {
	@Query("Select * from volunteer_reg where employee_id = :empId")
	Mono<VolunteerRegistered> findByEmployeeId(String empId);

	@Query("Select * from volunteer_reg where event_id = :eventId")
	Flux<VolunteerRegistered> findByEventId(Integer eventId);

}
