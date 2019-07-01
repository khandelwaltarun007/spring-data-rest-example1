package com.spring.data.rest.example1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.data.rest.example1.model.Department;

@RepositoryRestResource(collectionResourceRel = "departments",path = "departments",exported = true)
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long> {

}
