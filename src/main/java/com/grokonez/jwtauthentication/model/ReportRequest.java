package com.grokonez.jwtauthentication.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import  javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="ReportRequest")
@EntityListeners(AuditingEntityListener.class)


public class ReportRequest {

    @Id
    private String memberid;

    @NotBlank
    private String datetime;


    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
