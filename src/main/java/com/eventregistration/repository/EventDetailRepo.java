package com.eventregistration.repository;

import com.eventregistration.models.EventDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDetailRepo extends JpaRepository<EventDetails,Long> {

}
