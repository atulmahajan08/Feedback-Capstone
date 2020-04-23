package com.cts.feedback.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cts.feedback.entity.UnRegisteredFeedback;

import reactor.core.publisher.Flux;

public interface UnRegisteredFeedbackRepository extends ReactiveCrudRepository<UnRegisteredFeedback, Integer> {

	@Query("select comment from un_reg where event_event_id = :eventId ")
	public Flux<UnRegisteredFeedback> findUnRegisteredByEventId(String eventId);
}
