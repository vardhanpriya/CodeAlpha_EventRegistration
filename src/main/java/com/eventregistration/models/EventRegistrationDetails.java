package com.eventregistration.models;

import jakarta.persistence.*;

import lombok.Data;


import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "EVENT_REGISTRATION_DETAILS")
public class EventRegistrationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String eventId;
    private  String userId;
    private String registeredAt;


}
