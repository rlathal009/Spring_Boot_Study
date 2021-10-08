package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy= "member")  //일대다 관계, order table에 있는 member field에 의해 매핑됨. 즉, 연관관계의 주인이 아님.
    private List<Order> orders = new ArrayList<>();
}
