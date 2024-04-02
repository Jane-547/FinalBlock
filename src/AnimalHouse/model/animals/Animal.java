package AnimalHouse.model.animals;

import AnimalHouse.model.house.HouseItem;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public abstract class Animal implements Serializable, HouseItem {

    private int id;
    private String name;
    private String type;
    private LocalDate birthdate;
    private List<Animal> commands;

}
