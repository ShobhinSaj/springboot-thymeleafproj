package com.infosys.thymeleafproj.service;

import com.infosys.thymeleafproj.model.Employee;
import com.infosys.thymeleafproj.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepo repo;

    @Override
    public Iterable<Employee> getEmployees() {

        return repo.findAll();


    }
}
