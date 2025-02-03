package com.xworkz.ups.enetity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="ups_info")
@NamedQuery(name = "getUpsData",query = "select u from UpsEntity u")
@NamedQuery(name = "getUpsByBrand",query = "select x from UpsEntity x where x.brand =:brandName")
@NamedQuery(name = "getUpsBySellerName",query = "select a from UpsEntity a where a.sellerName =:sellerName")
@NamedQuery(name = "getAllBrandNames",query = "select a.brand from UpsEntity a")
@NamedQuery(name = "getAllPrice",query = "select a.price from UpsEntity a")
public class UpsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="brand")
    private String brand;
    @Column(name="sellerName")
    private String sellerName;
    @Column(name="watts")
    private int watts;
    @Column(name="price")
    private double price;
    @Column(name="uses")
    private String uses;
    @Column(name="capactiy")
    private String capacity;

}
