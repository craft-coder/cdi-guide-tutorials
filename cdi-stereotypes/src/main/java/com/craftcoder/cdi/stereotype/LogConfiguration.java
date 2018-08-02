package com.craftcoder.cdi.stereotype;

public class LogConfiguration {

	private boolean infoMode;

	private boolean debugMode;

	private boolean warnMode;

	public LogConfiguration(boolean infoMode, boolean debugMode, boolean warnMode) {
		this.infoMode = infoMode;
		this.debugMode = debugMode;
		this.warnMode = warnMode;
	}

	public boolean isInInfoMode() {
		return infoMode;
	}

	public boolean isInDebugMode() {
		return debugMode;
	}

	public boolean isInWarnMode() {
		return warnMode;
	}
}
