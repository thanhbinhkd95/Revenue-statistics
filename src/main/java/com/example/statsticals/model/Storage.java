package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long quantity;
    private String unit;
    private Long price;
    private Long brokenItems;
    @Column(columnDefinition = "Date")
    private String importDate;
    @OneToMany(mappedBy = "storage")
    private List<Supply> supplyList;
}
