package com.hello.spring;

import com.hello.spring.member.Grade;
import com.hello.spring.member.Member;
import com.hello.spring.member.MemberService;
import com.hello.spring.member.MemberServiceImpl;

public class MemverApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.signup(member);

        Member findMember = memberService.findMember(1L);
        System.out.println(member.getName());
        System.out.println(findMember.getName());

    }
}
