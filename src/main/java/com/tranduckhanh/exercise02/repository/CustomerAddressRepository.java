package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, String> {

}