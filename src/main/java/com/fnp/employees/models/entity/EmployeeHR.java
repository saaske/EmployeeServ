package com.fnp.employees.models.entity;

import com.fnp.employees.models.enumaration.Departments;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "EMP_HR")
public class EmployeeHR {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @OneToOne
    @MapsId
    private Employee employee;

    private int age;

    private String dateOfJoining;

    private String Salary;

    private Departments department;

//    @OneToMany(cascade = CascadeType.ALL)
//    List<Project> projects = new ArrayList<>();

}
