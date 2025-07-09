package com.eventregistration.controller;

import com.eventregistration.models.EventDetails;
import com.eventregistration.models.OrganizerDetails;
import com.eventregistration.service.EventDetailService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
@Tag(name = "Event  Related APIs")
public class EventDetailsController {
    @Autowired
    EventDetailService eventDetailService;
    @GetMapping("/{id}")
    public ResponseEntity<?> getEventById(@PathVariable Long id) {
        return ResponseEntity.ok(eventDetailService.getEventById(id));
    }

    @PostMapping("/create-event")
    public ResponseEntity<?> createUser(@RequestBody EventDetails eventDetails) {
        return ResponseEntity.ok(eventDetailService.createEvent(eventDetails));
    }
    @GetMapping("/fetch/all")
    public ResponseEntity<?> fetchAllEvents() {
        return ResponseEntity.ok(eventDetailService.fetchAllEvents());
    }
}
