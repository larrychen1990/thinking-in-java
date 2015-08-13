package com.hawk.c01.custom.generic;

public class Basket<E> {
	 
    private E element;   

    public void setElement(E x) {
            element = x;
    }

    public E getElement() {
            return element;        
    }
    
    public static void main(String[] args) {
//    	Basket<Fruit> basket = new Basket<Fruit>(); // 1
//    	basket.setElement(new Apple()); // 2
//    	Apple apple = basket.getElement(); // 3
    	
    	Basket<Fruit> basket = new Basket<Fruit>();
    	basket.setElement(new Apple());
    	Orange orange = (Orange) basket.getElement();
	}
}
class Fruit { }

class Apple extends Fruit { }

class Orange extends Fruit { }
