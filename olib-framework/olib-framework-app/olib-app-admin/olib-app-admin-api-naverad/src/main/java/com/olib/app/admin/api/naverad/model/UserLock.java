package com.olib.app.admin.api.naverad.model;


public enum UserLock {
	ENABLED(0),
	PAUSED(1);

//	@Getter(onMethod = @__({@JsonValue}))
	private final int value;

	private UserLock(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
}
