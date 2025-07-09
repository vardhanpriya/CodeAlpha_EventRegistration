package com.eventregistration.repository;

import com.eventregistration.models.OrganizerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerDetailRepo extends JpaRepository<OrganizerDetails,Long> {
}
