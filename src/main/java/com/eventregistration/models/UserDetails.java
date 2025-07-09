package com.eventregistration.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="USER_DETAILS")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private  String address;

}
