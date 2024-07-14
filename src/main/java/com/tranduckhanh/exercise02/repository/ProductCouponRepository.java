package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.ProductCoupon;

public interface ProductCouponRepository extends JpaRepository<ProductCoupon, String> {

}