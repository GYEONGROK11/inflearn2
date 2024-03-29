package com.hello.spring.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member member = new Member(1L,"memberA",Grade.VIP);

        //when
        memberService.signup(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertEquals(member,findMember);

    }
}
