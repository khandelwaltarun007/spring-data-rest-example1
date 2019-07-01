package com.spring.data.rest.example1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.data.rest.example1.model.Person;

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons", exported = true)
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
