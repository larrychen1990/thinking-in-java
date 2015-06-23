package com.hawk.c01.custom.enums.mapjson2;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UserE {
	ADMIN("admin simida"), USER("normal user");

	private String value;

	private UserE(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String getId() {
		return this.name();
	}

}
