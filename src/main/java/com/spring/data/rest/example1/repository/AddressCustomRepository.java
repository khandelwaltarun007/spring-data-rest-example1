package com.spring.data.rest.example1.repository;

import java.util.List;

import com.spring.data.rest.example1.model.Address;

public interface AddressCustomRepository {
	public List<Address> findByCity(String city);
}
