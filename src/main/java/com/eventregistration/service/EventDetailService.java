package com.eventregistration.service;

import com.eventregistration.models.EventDetails;

import java.util.List;

public interface EventDetailService {
    EventDetails getEventById(Long id);
    EventDetails createEvent(EventDetails event);

    List<EventDetails> fetchAllEvents();
}

