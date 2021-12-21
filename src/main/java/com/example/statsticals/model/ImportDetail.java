package com.example.statsticals.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ImportDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long quantity;
    private Long price;
    @Column(columnDefinition = "Date")
    private String date;
    @ManyToOne
    @JoinColumn(name = "supply_id", referencedColumnName = "id")
    private Supply supply;
}
