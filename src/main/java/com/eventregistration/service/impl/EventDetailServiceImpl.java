package com.eventregistration.service.impl;

import com.eventregistration.models.EventDetails;
import com.eventregistration.repository.EventDetailRepo;
import com.eventregistration.service.EventDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventDetailServiceImpl implements EventDetailService {
        @Autowired
        private EventDetailRepo eventDetailRepo;



    @Override
    public EventDetails getEventById(Long id) {
        return eventDetailRepo.findById(id).orElseThrow(() -> new RuntimeException("Event not found"));
    }

    @Override
    public EventDetails createEvent(EventDetails event) {
        event.setDate(LocalDate.now().toString());
        return eventDetailRepo.save(event);
    }

    @Override
    public List<EventDetails> fetchAllEvents() {
        return eventDetailRepo.findAll();
    }
}

