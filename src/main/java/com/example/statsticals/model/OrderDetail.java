package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long quantity;
    private Long price;
    @Column(columnDefinition = "Date")
    private String date;
    @OneToMany(mappedBy = "orderDetail")
    private List<Supply> supplyList;
    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "id")
    private Customer customer;
}
