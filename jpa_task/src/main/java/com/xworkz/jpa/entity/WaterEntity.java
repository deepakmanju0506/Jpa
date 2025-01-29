package com.xworkz.jpa.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "water")
public class WaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long c_no;
    private String location;
    private String name;
    private Long pincode;
    private Double rating;
    private String type;
}
