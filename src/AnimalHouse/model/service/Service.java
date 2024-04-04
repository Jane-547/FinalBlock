package AnimalHouse.model.service;

import AnimalHouse.model.animals.Animal;
import AnimalHouse.model.builder.AnimalBuilder;
import AnimalHouse.model.house.House;
import AnimalHouse.model.writer.Writable;

public class Service {

    private House<Animal> house;
    private AnimalBuilder builder;
    private Writable writable;

    public Service() {
        house = new House();
        builder = new AnimalBuilder();
    }


}
