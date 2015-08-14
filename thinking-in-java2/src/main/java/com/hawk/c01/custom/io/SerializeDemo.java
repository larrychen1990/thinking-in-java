package com.hawk.c01.custom.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// create an object
		Dog dog = new Dog();
		dog.setName("bulldog");
		dog.setColor("white");
		dog.setWeight(5);
		
		// serialize
		try {
			FileOutputStream fileOut = new FileOutputStream("src/main/java/com/hawk/c01/custom/io/dog.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(dog);
			out.close();
			System.out.printf("Serialized dog is saved in src/main/java/com/hawk/c01/custom/io/dog.ser");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		dog = null;
		
		// deserialize
		try {
			FileInputStream fileIn = new FileInputStream("src/main/java/com/hawk/c01/custom/io/dog.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			dog = (Dog) in.readObject();
			
			fileIn.close();
			in.close();
			
		} catch (Exception e) {
			System.out.println("Dog class not found");
			e.printStackTrace();
			return;
		}
		
		System.out.println("\nDeserialized Dog ...");
		System.out.println("Name: " + dog.getName());
		System.out.println("Color: " + dog.getColor());
		System.out.println("Weight: " + dog.getWeight());
 
		dog.introduce();
		
	}
}
