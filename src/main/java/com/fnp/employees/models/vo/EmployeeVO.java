package com.fnp.employees.models.vo;

import lombok.Data;
import java.util.List;

@Data
public class EmployeeVO {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String dateOfJoining;
    private String department;
    private String salary;
    private List<ProjectsVO> projects;
}

