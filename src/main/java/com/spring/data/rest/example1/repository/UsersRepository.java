package com.spring.data.rest.example1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.data.rest.example1.model.Users;

@RepositoryRestResource(collectionResourceRel = "users",path = "users",exported = true)
public interface UsersRepository extends PagingAndSortingRepository<Users, Long> {

}
