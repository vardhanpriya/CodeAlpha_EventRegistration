package com.eventregistration.controller;

import com.eventregistration.models.OrganizerDetails;
import com.eventregistration.models.UserDetails;
import com.eventregistration.repository.OrganizerDetailRepo;
import com.eventregistration.service.OrganizerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orgainzer")
@Tag(name = "Organizer Related APIs")
public class OrganizerDetailsController {
    @Autowired
    private OrganizerService organizerService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(organizerService.getOrganizerById(id));
    }

    @PostMapping("/create-organizer")
    public ResponseEntity<?> createUser(@RequestBody OrganizerDetails organizerDetails) {
        return ResponseEntity.ok(organizerService.createOrganizer(organizerDetails));
    }
    @GetMapping("/fetch/all")
    public ResponseEntity<?> fetchAllOrganizer() {
        return ResponseEntity.ok(organizerService.fetchAllOrganizer());
    }


}
