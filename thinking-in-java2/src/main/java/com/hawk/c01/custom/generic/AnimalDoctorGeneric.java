package com.hawk.c01.custom.generic;

import java.util.ArrayList;
import java.util.List;

abstract class Animal{
    public abstract void checkup();
}
class Dog extends Animal{
    public void checkup(){
        System.out.println("Dog checkup");
    }
}
class Cat extends Animal{
    public void checkup(){
        System.out.println("Cat checkup");
    }
}
class Bird extends Animal{
    public void checkup(){
        System.out.println("Bird checkup");
    }
}
public class AnimalDoctorGeneric {
    private void checkAnimals(ArrayList<Animal> animals){
        for(Animal a : animals){
            a.checkup();
        }
    }
    private void addAnimals(List<Animal> animals){
        animals.add(new Dog());
    }
    public static void main(String [] args){
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
        doc.addAnimals(animals);
        doc.checkAnimals((ArrayList<Animal>) animals);// error here!!!!
        //doc.checkAnimals((ArrayList<Animal>) animals); this line is the correct code
        //to use checkAnimals method, the argument has to be correct type. 
        //System.out.println(animals.get(1) + " " + animals.get(2));
    }
}
