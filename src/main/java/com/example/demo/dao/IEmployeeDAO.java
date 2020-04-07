package com.example.demo.dao;

import com.example.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IEmployeeDAO extends CrudRepository<Employee, Integer> {
    @Override
    List<Employee> findAll();
}
