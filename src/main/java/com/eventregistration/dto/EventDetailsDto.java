package com.eventregistration.dto;

import lombok.Data;

@Data
public class EventDetailsDto {
    private Long id;

    private String name;
    private String location;
    private String date;
    private String description;
}
