package com.spring.data.rest.example1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.data.rest.example1.model.Address;

@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses", exported = true)
public interface AddressRepository extends PagingAndSortingRepository<Address, Long>, AddressCustomRepository {

	@Query("SELECT addresses FROM Address addresses WHERE addresses.country = :country")
	public List<Address> findAddressesByCountry(@Param("country") String country);

	@Query(value = "SELECT address FROM Address address WHERE address.pincode = ?1")
	public Address findByPincode(String pincode);
}
