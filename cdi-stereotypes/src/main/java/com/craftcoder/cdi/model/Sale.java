package com.craftcoder.cdi.model;

import java.math.BigDecimal;

public class Sale {

	private String product;
	private BigDecimal value;

	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
