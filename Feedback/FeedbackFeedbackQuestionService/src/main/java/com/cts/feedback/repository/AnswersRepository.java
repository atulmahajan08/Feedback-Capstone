package com.cts.feedback.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cts.feedback.entity.Answer;

import reactor.core.publisher.Mono;

public interface AnswersRepository extends ReactiveCrudRepository<Answer, Integer> {

	@Query("DELETE FROM answer WHERE question_id = :questionId")
	Mono<Void> deleteByQuestionId(Integer questionId);
	
}