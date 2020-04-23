package com.cts.feedback.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.cts.feedback.entity.Role;

@Repository
public interface RoleRepository extends ReactiveCrudRepository<Role, Integer>{
 
}
