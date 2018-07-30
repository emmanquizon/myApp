package com.equizon.app.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.equizon.app.entity.Price;
import com.equizon.app.service.PriceService;

@Controller
public class MyAppController {

	@Autowired
	private PriceService priceService;
	
	@RequestMapping("/")	
	public String home(Map<String, Object> model) {
		List<Price> priceList = priceService.getAllPrice();
		double total = priceList.stream().mapToDouble(price -> price.getPrice()).sum();
		double average = total/priceList.size();
		model.put("priceList", priceList);
		model.put("average", average);
		return "index";
	}
	
	@RequestMapping("/price")	
	public String addPrice(Price price) {
		price.setTime(new Timestamp(System.currentTimeMillis()));
		priceService.savePrice(price);
		return "redirect:/";
	}
}
