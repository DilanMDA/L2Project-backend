package com.grokonez.jwtauthentication.message.response;

import com.grokonez.jwtauthentication.model.EventCreation;
import com.grokonez.jwtauthentication.model.EventRate;
import com.grokonez.jwtauthentication.model.SystemRate;

public class Response {
    private String status;
    private EventCreation eventCreation;
    private EventRate eventRate;
    private SystemRate systemRate;

    public SystemRate getSystemRate() {
        return systemRate;
    }

    public void setSystemRate(SystemRate systemRate) {
        this.systemRate = systemRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EventCreation getEventCreation() {
        return eventCreation;
    }

    public void setEventCreation(EventCreation eventCreation) {
        this.eventCreation = eventCreation;
    }

    public EventRate getEventRate() {
        return eventRate;
    }

    public void setEventRate(EventRate eventRate) {
        this.eventRate = eventRate;
    }
}
