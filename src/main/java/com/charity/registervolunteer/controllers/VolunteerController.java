package com.charity.registervolunteer.controllers;

import com.charity.registervolunteer.models.Volunteer;
import com.charity.registervolunteer.services.VolunteerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    private final VolunteerService volunteerService;

    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @PostMapping()
    public ResponseEntity<Volunteer> createVolunteer(@RequestBody Volunteer volunteer) {
        return ResponseEntity.ok(volunteerService.createVolunteer(volunteer));
    }

    @GetMapping()
    public ResponseEntity<List<Volunteer>> getAllVolunteers() {
        return ResponseEntity.ok(volunteerService.getAllVolunteers());
    }
}
