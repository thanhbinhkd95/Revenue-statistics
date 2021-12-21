package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String email;
    private Long address_id;
    private String phone;
    @OneToMany(mappedBy = "customer")
    private List<Supply> supplyList;
    @OneToMany(mappedBy = "customer")
    private List<OrderDetail> orderDetailList;
}
