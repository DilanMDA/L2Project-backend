package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
}
