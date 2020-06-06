package com.fnp.employees.controllers;

import com.fnp.employees.models.entity.Employee;
import com.fnp.employees.models.entity.EmployeeHR;
import com.fnp.employees.models.repository.EmployeeHRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/account")
public class EmployeeController {

    @Autowired
    EmployeeHRRepository employeeHRRepository;

    @GetMapping(value = "/employees", params = {"size"})
    public ResponseEntity<?> getEmployees(@RequestParam("size") int size) {
        List<EmployeeHR> employeeHRList = new ArrayList<>();
        Pageable limit = PageRequest.of(size-1,3);
        employeeHRRepository.findAll(limit).forEach(employeeHR-> employeeHRList.add(employeeHR));
        return new ResponseEntity<>(employeeHRList, HttpStatus.OK);
    }
}
