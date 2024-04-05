package dev.gabyy.autoluxmotors.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String model;
    private String brand;
    private String engine;
    private String color;
    private String patent;
    private int doorAMount;

    public Car() {
    }

    public Car(int id, String model, String brand, String engine, String color, String patent, int doorAMount) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.patent = patent;
        this.doorAMount = doorAMount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public int getDoorAMount() {
        return doorAMount;
    }

    public void setDoorAMount(int doorAMount) {
        this.doorAMount = doorAMount;
    }

}
