package com.chronoscript.nutrimate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Dietitian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    private String profile_image;
    private String occupation;
    private String contact_no;
    private String bio;
    private String employer_name;
    private String employment_duration;
    private String responsibilities;
    private String degree;
    private String institution;
    private String graduation_year;
    private String awards;
    private String Additional_qualifications;
    private String certification;
    private String issued_organization;
    private String duration;
    private String expiration_date;

}
