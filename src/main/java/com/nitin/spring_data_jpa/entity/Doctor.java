package com.nitin.spring_data_jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private String specialization;
    private Double consultationFees;
    @Column(unique = true,nullable = false)
    private String licenseNumber;
}
