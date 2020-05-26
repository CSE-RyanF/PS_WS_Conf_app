package com.pluralsight.conf2makerdemo.repositories;

import com.pluralsight.conf2makerdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}

