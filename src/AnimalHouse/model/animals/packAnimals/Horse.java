package AnimalHouse.model.animals.packAnimals;

import AnimalHouse.model.animals.pets.Pets;

import java.time.LocalDate;

public class Horse extends PackAnimals {
    public Horse(String name, LocalDate birthdate) {
        super(name, birthdate);
        this.type += ", лошадь";
    }
}
