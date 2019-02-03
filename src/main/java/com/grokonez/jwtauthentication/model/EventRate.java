package com.grokonez.jwtauthentication.model;

import javax.persistence.*;

@Entity
public class EventRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int rate;
    private Long user_id;
    private Long event_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

    public EventRate(int rate, Long user_id, Long event_id) {
        this.rate = rate;
        this.user_id = user_id;
        this.event_id = event_id;
    }

    public EventRate() {
    }

    @Override
    public String toString() {
        return "EventRate{" +
                "id=" + id +
                ", rate=" + rate +
                ", user_id=" + user_id +
                ", event_id=" + event_id +
                '}';
    }
}
