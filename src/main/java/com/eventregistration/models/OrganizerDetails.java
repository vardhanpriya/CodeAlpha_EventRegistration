package com.eventregistration.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ORGANIZER_DETAILS")
public class OrganizerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;

}
