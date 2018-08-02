package com.craftcoder.cdi.stereotype;

import javax.enterprise.inject.Produces;

public class AwesomeLoggerFactory {

	@Produces @LoggerMode(desiredMode = Mode.DEBUG)
	public AwesomeLogger createDebugLogger() { //yes, I renamed it
		boolean debugMode = true; //just to be clear that the debug mode is on
		LogConfiguration logInDebugMode = new LogConfiguration(false, debugMode, false);

		return new AwesomeLogger(logInDebugMode);
	}

	@Produces @LoggerMode(desiredMode = Mode.INFO)
	public AwesomeLogger createInfoLogger() { //new method here :)
		boolean infoMode = true;
		LogConfiguration logInInfoMode = new LogConfiguration(infoMode, false, false);

		return new AwesomeLogger(logInInfoMode);
	}

	@Produces @LoggerMode(desiredMode = Mode.WARN)
	public AwesomeLogger createWarnLogger() { //new method here :)
		boolean warnMode = true;
		LogConfiguration logInWarnMode = new LogConfiguration(false, false, warnMode);

		return new AwesomeLogger(logInWarnMode);
	}
	
}
