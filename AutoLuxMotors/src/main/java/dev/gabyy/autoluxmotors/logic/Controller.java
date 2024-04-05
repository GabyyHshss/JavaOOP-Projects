package dev.gabyy.autoluxmotors.logic;

import dev.gabyy.autoluxmotors.persistence.PersistenceController;
import java.util.List;

/**
 *
 * @author gabrielsan
 */
public class Controller {
    
    PersistenceController persisControl = new PersistenceController();

    public void addCar(String model, String brand, String engine, String color, String patent, int doorAmount) {
        Car car = new Car();
        car.setModel(model);
        car.setBrand(brand);
        car.setColor(color);
        car.setEngine(engine);
        car.setPatent(patent);
        car.setDoorAMount(doorAmount);
        
        persisControl.addCar (car);
    }

    public List<Car> bringCar() {
        return persisControl.bringCar();
        }

    public void deleteCar(int idCar) {
        persisControl.deleteCar(idCar);
    }

    public Car bringTheCar(int idCar) {
        return persisControl.bringTheCar(idCar);
    }

    public void addTheCar(Car car, String model, String brand, String engine
            , String color, String patent, int doorAmount) {
        car.setModel(model);
        car.setBrand(brand);
        car.setEngine(engine);
        car.setColor(color);
        car.setDoorAMount(doorAmount);
        
        persisControl.addTheCar(car);
    }
    
}
