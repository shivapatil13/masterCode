package com.flightapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.model.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
	Users findByUserName(String userName);

}
