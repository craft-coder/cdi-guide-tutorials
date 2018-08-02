package com.craftcoder.cdi.stereotype;

public class AwesomeLogger {
	private LogConfiguration configuration;

	public AwesomeLogger(LogConfiguration configuration) {
		this.configuration = configuration;
	}

	public void log(String message) {
		if (configuration.isInDebugMode()) {
			System.out.println("DEBUG LOG: " + message);
		}
		else if (configuration.isInInfoMode()) {
			System.out.println("INFO LOG: " + message);
		} else if (configuration.isInWarnMode()) {
			System.out.println("WARN LOG: " + message);
		} else {
			System.out.println("DEFAULT LOG: " + message);
		}
	}
}
