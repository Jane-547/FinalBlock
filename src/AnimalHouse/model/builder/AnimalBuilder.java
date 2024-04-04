package AnimalHouse.model.builder;

import AnimalHouse.model.animals.Animal;

import java.time.LocalDate;

public class AnimalBuilder {

    public Animal build (String name, LocalDate birthdate) {
        Animal animal = new Animal(name, birthdate){

        };
        return animal;
    }

}
