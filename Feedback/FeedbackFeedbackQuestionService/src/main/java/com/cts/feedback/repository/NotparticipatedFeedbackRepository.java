package com.cts.feedback.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cts.feedback.entity.NotParticipatedFeedBack;

import reactor.core.publisher.Flux;

public interface NotparticipatedFeedbackRepository extends ReactiveCrudRepository<NotParticipatedFeedBack, Integer> {

	@Query("select comment from non_participated where event_event_id = :eventId")
	public Flux<NotParticipatedFeedBack> findNotparticipatedByEventId(String eventId);

}
