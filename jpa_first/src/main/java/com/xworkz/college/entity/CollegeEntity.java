package com.xworkz.college.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="college_info")
public class CollegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue(strategy = G)
    @Column(name="college_id")
    private int collegeId;
    @Column(name="college_Name")
    private String collegeName;
    @Column(name="noOfStudents")
    private int noOfStudent;
    @Column(name="college_location")
    private String location;
    @Column(name="college_founder")
    private String founderName;
}
