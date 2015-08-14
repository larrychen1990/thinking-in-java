package com.hawk.c01.custom.io;

import java.io.Serializable;

public class Dog implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String color;
	private transient int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void introduce(){
		System.out.println("I have a "+ color + " " + name + ".");
	}
}
