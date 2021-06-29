package com.flightapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flightapp.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

	@Query(value = "SELECT us.user_name from users us", nativeQuery = true)
	Object getUser();

}
