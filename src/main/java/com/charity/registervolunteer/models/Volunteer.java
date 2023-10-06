package com.charity.registervolunteer.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Volunteer {

    private UUID registrationId;
    private LocalDateTime createdAt;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNum;
    private String event;
}
