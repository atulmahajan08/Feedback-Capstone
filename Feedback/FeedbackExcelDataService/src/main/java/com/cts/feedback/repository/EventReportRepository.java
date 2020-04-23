package com.cts.feedback.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.feedback.entity.EventReport;

import reactor.core.publisher.Flux;

@Repository
public interface EventReportRepository extends ReactiveCrudRepository<EventReport, Integer> {
	
	@Query("select * from event_report where event_id = ?eventId")
	Flux<EventReport> findByEventId(String eventId);

}
