package com.xworkz.jpa.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="laptop_info")
public class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="brand")
    private String brand;
    @Column(name="modelNO")
    private String modelNO;
    @Column(name="sellerName")
    private String sellerName;
    @Column(name="price")
    private double price;
    @Column(name="storage")
    private int storage;

}
