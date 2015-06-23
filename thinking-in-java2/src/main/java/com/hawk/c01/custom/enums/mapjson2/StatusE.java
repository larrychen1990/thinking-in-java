package com.hawk.c01.custom.enums.mapjson2;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum StatusE {
	OPEN("open rule"), CLOSED("closed rule"), WORKING("rule in work");

	private String value;

	private StatusE(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public String getId() {
		return this.name();
	}

}
