package com.example.demo.service;

import com.example.demo.dao.IEmployeeDAO;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class EmpService {

    @Autowired
    IEmployeeDAO employeeDao;

    public Employee addEmp(Employee e){
        return employeeDao.save(e);
    }

    public List<Employee> getAllEmployees(){
        return employeeDao.findAll();
    }

    public Employee getEmployee(int empId){
        Optional<Employee> employee = employeeDao.findById(empId);
        if(!employee.isPresent())
            throw new EmployeeNotFoundException("Employee record not present!");
        return employee.get();
    }

    public Employee updateEmployee(int empId, Employee emp){
        emp.setEmpId(empId);
       return employeeDao.save(emp);
    }

    public void deleteEmployee(int empId){
       employeeDao.deleteById(empId);
    }
}
