package com.fnp.employees.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "EMP")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String employeeId;
    private String firstName;
    private  String lastName;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Project> projects = new ArrayList<>();

}
