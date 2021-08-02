package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AnimalFactory af = new AnimalFactory();
        // a duck
        Animal aDuck = af.getAnimal("Duck");
        aDuck.makeSoud();

        // a tiger
        Animal aTiger = af.getAnimal("Tiger");
        aTiger.makeSoud();
    }
}
