package com.craftcoder.cdi.stereotype;

import javax.inject.Inject;

import com.craftcoder.cdi.model.Sale;

@StereotypeSample
public class Checkout {

	@Inject @LoggerMode(desiredMode = Mode.DEBUG)
	private AwesomeLogger logger;

	public void finishCheckout(Sale sale) {	
		
		logger.log("Finishing Checkout");
	}
}
