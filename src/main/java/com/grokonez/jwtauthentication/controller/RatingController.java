package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.Constants.Constants;
import com.grokonez.jwtauthentication.model.EventRate;
import com.grokonez.jwtauthentication.message.response.Response;
import com.grokonez.jwtauthentication.model.SystemRate;
import com.grokonez.jwtauthentication.repository.EventRateRepository;
import com.grokonez.jwtauthentication.repository.SystemRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RatingController {

    @Autowired
    EventRateRepository err;

    @Autowired
    SystemRateRepository sysRate;

    @PostMapping("/RateEvent")
    public Response rateEvent(@RequestBody EventRate e){
        err.save(e);
        Response response = new Response();
        response.setEventRate(e);
        response.setStatus(Constants.STATUS_SUCCESS);
        return response;
    }

    @GetMapping("/GetRating")
    public String getRating(@RequestParam String event_id){
        List<EventRate> li = err.findEventRatesByEvent_id(Long.parseLong(event_id));
        double rate = 0;
        long count=0;
        for(EventRate e:li){
            System.out.println(e.toString());
            rate += e.getRate();
            count++;
        }
        rate /= count;
        return "{\"rating\":\""+rate+"\"}";
    }

    @GetMapping("/UserEventRatings")
    public List<EventRate> getRatings(@RequestParam Long user_id){
        return err.findEventRatesByUser_id(user_id);
    }


    @PostMapping("/SystemRate")
    public Response rateSystem(@RequestBody SystemRate sr){
        sysRate.save(sr);
        Response res = new Response();
        res.setStatus(Constants.STATUS_SUCCESS);
        res.setSystemRate(sr);
        return res;
    }

}
