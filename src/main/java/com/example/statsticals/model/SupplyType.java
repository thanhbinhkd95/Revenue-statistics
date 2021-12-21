package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class SupplyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "supplyType")
    private List<Supply> supplyList;
}
