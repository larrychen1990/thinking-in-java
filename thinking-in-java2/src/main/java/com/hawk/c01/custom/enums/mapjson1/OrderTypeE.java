package com.hawk.c01.custom.enums.mapjson1;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = OrderTypeSerializer.class)
public enum OrderTypeE implements NamedEnum{
	UNKNOWN(0, "Undefined"), TYPEA(1, "Type A"), TYPEB(2, "Type B"), TYPEC(3,
			"Type C");

	private Integer id;
	private String name;

	private OrderTypeE(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
