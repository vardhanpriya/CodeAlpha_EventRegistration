package com.eventregistration.service;

import com.eventregistration.models.OrganizerDetails;

import java.util.List;

public interface OrganizerService {

        OrganizerDetails getOrganizerById(Long id);
        OrganizerDetails createOrganizer(OrganizerDetails organizerDetails);

       List<OrganizerDetails> fetchAllOrganizer();
    }


