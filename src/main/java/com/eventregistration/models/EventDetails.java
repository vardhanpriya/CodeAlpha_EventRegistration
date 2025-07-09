package com.eventregistration.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "EVENT_DETAILS")
public class EventDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String date;
    private String description;
}
