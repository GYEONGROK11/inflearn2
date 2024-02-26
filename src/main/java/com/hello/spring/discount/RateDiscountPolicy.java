package com.hello.spring.discount;

import com.hello.spring.member.Grade;
import com.hello.spring.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountRateAmount = 1000;//1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountRateAmount;
        } else {
            return 0;
        }
    }


}
