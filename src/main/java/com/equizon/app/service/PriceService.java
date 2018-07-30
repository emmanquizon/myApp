package com.equizon.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equizon.app.entity.Price;
import com.equizon.app.repository.PriceRepository;

@Service
public class PriceService {
	@Autowired
	private PriceRepository priceRepository;
	
	public void savePrice(Price price) {
		priceRepository.saveAndFlush(price);
	}
	
	public List<Price> getAllPrice() {
		return priceRepository.findAll();
	}
}
