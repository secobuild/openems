package io.openems.edge.ess.refu88k;

import io.openems.edge.common.channel.doc.OptionsEnum;

public enum OperatingState implements OptionsEnum {
	UNDEFINED(-1, "Undefined"),
	OFF(1, "Off"),
	SLEEPING(2, "Sleeping"),
	STARTING(3, "Starting"),
	MPPT(4, "MPPT"),
	THROTTLED(5, "Throttled"),
	SHUTTING_DOWN(6, "Shutting Down"),
	FAULT(7, "Fault"),
	STANDBY(8, "Standby"),
	STARTED(9, "Started")
	;

	private final int value;
	private final String name;

	private OperatingState(int value, String name) {
		this.value = value;
		this.name = name;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public OptionsEnum getUndefined() {
		return UNDEFINED;
	}

}
