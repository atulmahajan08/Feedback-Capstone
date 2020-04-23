package com.cts.feedback.email.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.feedback.email.entity.VolunteerUnRegistered;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface VolunteerUnRegisteredRepository extends ReactiveCrudRepository<VolunteerUnRegistered, Integer> {
	@Query("Select * from volunteer_unreg where employee_id = :empId")
	Mono<VolunteerUnRegistered> findByEmployeeId(String empId);

	@Query("Select * from volunteer_unreg where event_id = :eventId")
	Flux<VolunteerUnRegistered> findByEventId(Integer eventId);

}
