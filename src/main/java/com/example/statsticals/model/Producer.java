package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "producer")
    private List<Supply> supplyList;
}

