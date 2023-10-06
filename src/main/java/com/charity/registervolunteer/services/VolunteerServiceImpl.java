package com.charity.registervolunteer.services;

import com.charity.registervolunteer.models.Volunteer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VolunteerServiceImpl implements VolunteerService {

    private final List<Volunteer> volunteerList = new ArrayList<>();

    @Override
    public Volunteer createVolunteer(Volunteer volunteer) {
        volunteer.setRegistrationId(UUID.randomUUID());
        volunteer.setCreatedAt(LocalDateTime.now());
        volunteerList.add(volunteer);

        return volunteer;
    }

    @Override
    public List<Volunteer> getAllVolunteers() {
        return volunteerList;
    }
}
