package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.JoinEvent;
import com.grokonez.jwtauthentication.repository.JoinEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class JoinEventController {

    @Autowired
    JoinEventRepository joinEventRepository;

    @PostMapping("/joinevent/{memberid}/{eventid}")
    public JoinEvent createEventJoin(@PathVariable(value = "memberid")Long memberid,@PathVariable(value = "eventid") String eventid,
                                     @Valid @RequestBody JoinEvent joinEventobj){
        JoinEvent joinevent = new JoinEvent();
        joinevent.setMemberid(memberid);
        joinevent.setEventid(eventid);

        return joinEventRepository.save(joinevent);
    }

}
