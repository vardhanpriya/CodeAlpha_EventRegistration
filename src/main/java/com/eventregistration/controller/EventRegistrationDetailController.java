package com.eventregistration.controller;

import com.eventregistration.models.EventDetails;
import com.eventregistration.models.EventRegistrationDetails;
import com.eventregistration.service.EventRegistrationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
@Tag(name = "Event Registration Related APIs")
public class EventRegistrationDetailController {
    @Autowired
   EventRegistrationService eventRegistrationService;
    @GetMapping("/{registrationId}")
    public ResponseEntity<?> getRegistrationById(@PathVariable("registrationId")Long id) {
        return ResponseEntity.ok(eventRegistrationService.getRegistrationById(id));
    }

    @PostMapping("/event-registration")
    public ResponseEntity<?> registerEvent(@RequestBody EventRegistrationDetails registrationDetails)
    {
        return ResponseEntity.ok(eventRegistrationService.register(registrationDetails));
    }
    @GetMapping("/fetch/all")
    public ResponseEntity<?> fetchAllRegistrations() {
        return ResponseEntity.ok(eventRegistrationService.fetchAllRegistrations());
    }
    @GetMapping("/fetch/registration/{userId}")
    public ResponseEntity<?> fetchRegistrationByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(eventRegistrationService.getRegistrationByUserId(userId));
    }
    @GetMapping("/get/registration/{eventId}")
    public ResponseEntity<?> fetchRegistrationByEventId(@PathVariable Long eventId) {
        return ResponseEntity.ok(eventRegistrationService.getRegistrationByEventId(eventId));
    }


    @DeleteMapping("/cancel/{regId}")
    public ResponseEntity<?> cancelRegistrationByRegId(@PathVariable Long regId)  {
        eventRegistrationService.cancelRegistration(regId);
        return new ResponseEntity<>("your event cancelled successfully", HttpStatus.OK);
    }

}
