package com.microservices.user_service.repositories;

import com.microservices.user_service.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface user_repo extends JpaRepository<user,Integer> {
}
