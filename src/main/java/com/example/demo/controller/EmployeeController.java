package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmpService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp){
        return employeeService.addEmp(emp);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(value = "/{empId}")
    public Employee getEmployeeById(@PathVariable(value = "empId") int empId){
        return employeeService.getEmployee(empId);
    }

    @PutMapping(value = "/{empId}")
    public Employee updateEmployee(@PathVariable(value = "empId") int empId, @RequestBody Employee emp){
        return employeeService.updateEmployee(empId, emp);
    }

    @DeleteMapping(value = "/{empId}")
    public void deleteEmployee(@PathVariable(value = "empId") int empId){
        employeeService.deleteEmployee(empId);
    }
}
