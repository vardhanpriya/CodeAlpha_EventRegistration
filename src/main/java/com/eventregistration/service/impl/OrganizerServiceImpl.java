package com.eventregistration.service.impl;

import com.eventregistration.models.OrganizerDetails;
import com.eventregistration.repository.OrganizerDetailRepo;
import com.eventregistration.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerServiceImpl implements OrganizerService {

    @Autowired
    private OrganizerDetailRepo organizerDetailRepo;
    @Override
    public OrganizerDetails getOrganizerById(Long id) {
        return organizerDetailRepo.findById(id).orElseThrow(() -> new RuntimeException("Organizer not found"));

    }

    @Override
    public OrganizerDetails createOrganizer(OrganizerDetails organizerDetails) {
        return organizerDetailRepo.save(organizerDetails);
    }

    @Override
    public List<OrganizerDetails> fetchAllOrganizer() {
        return organizerDetailRepo.findAll();
    }
}
