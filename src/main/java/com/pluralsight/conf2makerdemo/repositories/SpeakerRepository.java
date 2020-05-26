package com.pluralsight.conf2makerdemo.repositories;

import com.pluralsight.conf2makerdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
