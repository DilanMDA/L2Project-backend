package com.grokonez.jwtauthentication.model;

import javax.persistence.*;

@Entity
public class SystemRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long user_id;
    private int rate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public SystemRate() {
    }

    public SystemRate(Long user_id, int rate) {
        this.user_id = user_id;
        this.rate = rate;
    }
}
