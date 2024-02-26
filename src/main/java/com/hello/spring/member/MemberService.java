package com.hello.spring.member;

public interface MemberService {

    void signup(Member member);

    Member findMember(Long memberId);
}
