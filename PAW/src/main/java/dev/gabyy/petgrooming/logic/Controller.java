package dev.gabyy.petgrooming.logic;

import dev.gabyy.petgrooming.persistence.PersistenceController;

/**
 *
 * @author gabrielsan
 */
public class Controller {

    PersistenceController persisControl = new PersistenceController();

    public void saveAll(String name, String breed, String color,
            String numberOwner, String obs, String ownerName,
            String allergic, String attention) {
        //Owner, assign data
        Owner owner = new Owner();
        owner.setName(ownerName);
        owner.setCelOwner(numberOwner);
        //Pet, assing data
        Pet pet = new Pet();
        pet.setAllergic(allergic);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setName(name);
        pet.setObservations(obs);
        pet.setSpecialAttention(attention);
        pet.setOwner(owner);
        //SAVE WITH PERSISTENCE
        persisControl.saveData(owner, pet);
    }

}
