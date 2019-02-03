package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Member;
import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;



    @PutMapping("/member/{id}")
    public Member updateMember(@PathVariable(value = "id") Long id,
                             @Valid @RequestBody Member memberDetails) {



        Member memberObj = new Member();
        memberObj.setId(memberDetails.getId());
        memberObj.setFirstname(memberDetails.getFirstname());
        memberObj.setLastname(memberDetails.getLastname());
        memberObj.setDob(memberDetails.getDob());
        memberObj.setDob(memberDetails.getDob());
        memberObj.setGender(memberDetails.getGender());
        memberObj.setEmail(memberDetails.getEmail());
        memberObj.setPhonenumber(memberDetails.getPhonenumber());
        memberObj.setUsername(memberDetails.getUsername());
        memberObj.setPassword(memberDetails.getPassword());

        Member updatedMember = memberRepository.save(memberObj);
        return updatedMember;
    }

}
