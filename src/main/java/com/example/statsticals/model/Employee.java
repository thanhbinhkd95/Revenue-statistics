package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long code;
    private String name;
    @Column(columnDefinition = "Date")
    private String birthDate;
    private String image;
    private String gender;
    private String address;
    @OneToOne
    @JoinColumn(columnDefinition = "customer_id",referencedColumnName = "id")
    private Salary salary;
}
