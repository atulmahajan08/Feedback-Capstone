package com.cts.feedback.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.feedback.entity.User;

import reactor.core.publisher.Mono;

/**
 * @author 805896
 *
 */
@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Integer> {
	@Query("SELECT * FROM user WHERE emp_id = :empId")
	Mono<User> findByEmpId(String empId);
	
	@Query("DELETE FROM user WHERE emp_id = :empId")
	Mono<User> delete(String empId);
}
