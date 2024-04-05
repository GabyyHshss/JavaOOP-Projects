package dev.gabyy.autoluxmotors.persistence;

import dev.gabyy.autoluxmotors.logic.Car;
import dev.gabyy.autoluxmotors.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabrielsan
 */
public class PersistenceController {

    CarJpaController carJpa = new CarJpaController();

    public void addCar(Car car) {
        carJpa.create(car);
    }

    public List<Car> bringCar() {
        return carJpa.findCarEntities();
    }

    public void deleteCar(int idCar) {
        try {   
            carJpa.destroy(idCar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Car bringTheCar(int idCar) {
        return carJpa.findCar(idCar);
    }

    public void addTheCar(Car car) {
        try {
            carJpa.edit(car);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
