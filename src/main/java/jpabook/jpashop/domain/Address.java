package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable  //어딘가에 내장 될 수 있다
@Getter
public class Address {  //값 타입은 변경 불가능하게 함.

    private String city;
    private String street;
    private String zipcode;

    private Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
