package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Supply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private Long price;
    private String production_date;
    private String expiry_date;
    private String introduce;
    private String technical_infomation;
    private String image;

    @ManyToOne
    @JoinColumn(name ="customer_id",referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name ="producer_id",referencedColumnName = "id")
    private Producer producer;
    @ManyToOne
    @JoinColumn(name ="supplyType",referencedColumnName = "id")
    private SupplyType supplyType;

}
