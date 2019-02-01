package com.grokonez.jwtauthentication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import com.grokonez.jwtauthentication.model.EventCreation;
import com.grokonez.jwtauthentication.repository.EventCreationRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EventCreationController {

    @Autowired
    EventCreationRepository eventCreationRepository;
    @GetMapping("/event")
    public List<EventCreation> getAllMembers(){return eventCreationRepository.findAll();}

    @PostMapping("/eventcreation")
    public EventCreation createEvent (@Valid @RequestBody EventCreation eventDataObj){
        return eventCreationRepository.save(eventDataObj);
    }
}
