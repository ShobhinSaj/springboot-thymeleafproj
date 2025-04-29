package com.infosys.thymeleafproj.repo;

import com.infosys.thymeleafproj.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee,Integer> {
}
