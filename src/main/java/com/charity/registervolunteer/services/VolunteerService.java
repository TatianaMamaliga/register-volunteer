package com.charity.registervolunteer.services;

import com.charity.registervolunteer.models.Volunteer;

import java.util.List;

public interface VolunteerService {
    Volunteer createVolunteer(Volunteer volunteer);
    List<Volunteer> getAllVolunteers();
}
