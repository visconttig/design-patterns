package com.company;

public class AnimalFactory {
    public Animal getAnimal(String animalType){
        if (animalType == null){
            return null;
        } else if (animalType.equalsIgnoreCase("Duck")){
            return new Duck();
        } else if (animalType.equalsIgnoreCase("Tiger")){
            return new Tiger();
        }

        return null;
    }
}
