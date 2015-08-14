package com.hawk.c01.custom.collections;

import java.util.Arrays;
import java.util.Comparator;


//“Comparator< ? super T > c”. < ? super T > means the type can be T or its super types.
class Dog {
	int size;
	int wight;

	public Dog(int size, int wight) {
		this.size = size;
		this.wight = wight;
	}

}

class DogSizeComparator implements Comparator<Dog> {

	public int compare(Dog o1, Dog o2) {
		return o1.size - o2.size;
	}

}

class DogWightComparator implements Comparator<Dog> {

	public int compare(Dog o1, Dog o2) {
		return o1.wight - o2.wight;
	}

}

class Animal{
	int size;
}

class Tigger extends Animal{

	public Tigger(int size) {
		this.size = size;
	}
	
}
class Cat extends Animal{
	
	public Cat(int size) {
		this.size = size;
	}
	
}

class AnimalSizeComparator implements Comparator<Animal> {
	
	public int compare(Animal o1, Animal o2) {
		return o1.size - o2.size;
	}
	
}
public class ArraySort {
	public static void main(String[] args) {
		Dog dog1 = new Dog(2, 50);
		Dog dog2 = new Dog(1, 30);
		Dog dog3 = new Dog(3, 40);

		Dog[] dogs = { dog1, dog2, dog3 };
		printDog(dogs);

		Arrays.sort(dogs, new DogSizeComparator());
		printDog(dogs);
		
		Arrays.sort(dogs, new DogWightComparator());
		printDog(dogs);
		
		
		System.out.println("=============================================");
		
		Tigger tigger1 = new Tigger(2);
		Tigger tigger2 = new Tigger(1);
		Tigger tigger3 = new Tigger(3);
		
		Tigger[] tiggers = {tigger1,tigger2,tigger3};
		printAnimals(tiggers);
		
		Cat cat1 = new Cat(2);
		Cat cat2 = new Cat(1);
		Cat cat3 = new Cat(3);
		
		Cat[] cats = {cat1,cat2,cat3};
		printAnimals(cats);
		
		Arrays.sort(cats, new AnimalSizeComparator());
		printAnimals(cats);
		

	}

	public static void printDog(Dog[] dogs) {
		for (Dog dog : dogs) {
			System.out.print(dog.size + " ");
		}
		System.out.println();
	}
	
	public static void printAnimals(Animal[] animals) {
		for (Animal animal : animals) {
			System.out.print(animal.size + " ");
		}
		System.out.println();
	}
}
