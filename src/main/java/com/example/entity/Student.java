package com.example.StudentManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    private String department;
    
    private Integer yearOfEnrollment;
}
