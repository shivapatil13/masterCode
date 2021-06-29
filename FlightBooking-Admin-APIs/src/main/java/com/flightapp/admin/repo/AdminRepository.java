package com.flightapp.admin.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flightapp.admin.entities.AdminAccountEntity;

public interface AdminRepository extends JpaRepository<AdminAccountEntity, Serializable> {
	@Query(name = "from AdminAccountEntity where email=: email")
	public AdminAccountEntity findByEmail(String email);

}
