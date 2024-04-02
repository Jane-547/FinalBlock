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

    public Animal(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.type = "Животное";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public List<Animal> getCommands() {
        return commands;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setCommands(List<Animal> commands) {
        this.commands = commands;
    }
}

