package com.cts.feedback.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cts.feedback.entity.Question;

public interface QuestionsRepository extends ReactiveCrudRepository<Question, Integer> {


}