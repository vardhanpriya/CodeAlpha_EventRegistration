package com.eventregistration.service;

import com.eventregistration.models.EventRegistrationDetails;

import java.util.List;

public interface EventRegistrationService {
    EventRegistrationDetails register(EventRegistrationDetails registration);
    List<EventRegistrationDetails> getRegistrationByUserId(Long userId);
    EventRegistrationDetails getRegistrationById(Long registrationId);
    List<EventRegistrationDetails> getRegistrationByEventId(Long eventId);
    List<EventRegistrationDetails> fetchAllRegistrations();
    void cancelRegistration(Long registrationId);
}

