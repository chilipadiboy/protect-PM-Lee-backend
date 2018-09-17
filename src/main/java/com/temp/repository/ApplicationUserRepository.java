package com.temp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temp.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByNric(String nric);
}
