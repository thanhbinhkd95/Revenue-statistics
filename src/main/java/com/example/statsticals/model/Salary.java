package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    @OneToOne(mappedBy = "salary")
    private Employee employee;

}
