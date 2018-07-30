package com.equizon.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equizon.app.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {
	
}