package com.spring.data.rest.example1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.data.rest.example1.model.Employee;

@RepositoryRestResource(collectionResourceRel = "employees",path = "employees",exported = true)
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
