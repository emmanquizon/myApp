package com.equizon.app.model;

import java.io.Serializable;

public class PriceModel implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
