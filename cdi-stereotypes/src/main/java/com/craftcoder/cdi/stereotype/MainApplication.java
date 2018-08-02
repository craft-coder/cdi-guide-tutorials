package com.craftcoder.cdi.stereotype;

import java.math.BigDecimal;

import javax.enterprise.inject.spi.CDI;

import org.jboss.weld.environment.se.Weld;

import com.craftcoder.cdi.model.Sale;

public class MainApplication {

	public static void main(String[] args) {
		try (CDI<Object> container = new Weld().initialize()) {
		
			Sale sale = new Sale();
			sale.setProduct("Book 1");
			sale.setValue(new BigDecimal(100));
			
			Checkout checkout = container.select(Checkout.class).get();
			
			checkout.finishCheckout(null);
		}
	}
}
