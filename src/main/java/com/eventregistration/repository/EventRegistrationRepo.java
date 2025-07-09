package com.eventregistration.repository;

import com.eventregistration.models.EventRegistrationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRegistrationRepo extends JpaRepository<EventRegistrationDetails,Long> {

    List<EventRegistrationDetails> findByUserId(String userId);
    List<EventRegistrationDetails> findRegistrationDetailByEventId(String eventId);


}
