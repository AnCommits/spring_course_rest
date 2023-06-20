package com.zaurtregulov.spring.rest.controller;

import com.zaurtregulov.spring.rest.entity.Employee;
import com.zaurtregulov.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
//        List<Employee> allEmployees = new ArrayList<>();
//        Employee e1 = new Employee("Ab", "Sab", "IT", 555);
//        Employee e2 = new Employee("Bc", "Sbc", "Sales", 500);
//        allEmployees.add(e1);
//        allEmployees.add(e2);
        return allEmployees;
    }
}
