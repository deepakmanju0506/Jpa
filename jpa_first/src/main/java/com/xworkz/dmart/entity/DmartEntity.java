package com.xworkz.dmart.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dmart")
public class DmartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Study this
    @Column(name="dmart_id")
    private int dmartId;
    @Column(name="dmart_location")
    private String dmartLocation;
    @Column(name="no_items")
    private int noItems;
    @Column(name="dmart_manager")
    private String dmartManager;
    @Column(name="GST_no")
    private String gstNo;
}
