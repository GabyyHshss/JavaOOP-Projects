package dev.gabyy.petgrooming.logic;

import dev.gabyy.petgrooming.persistence.PersistenceController;
import java.util.List;

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

    public List<Pet> bringPet() {
        return persisControl.bringPets();
    }

    public void deletePet(int clientId) {
        persisControl.deletePet(clientId);
    }

    public Pet bringPet(int clientId) {
        return persisControl.bringPet(clientId);
    }

    public void modifyPet(Pet pet, String name, String breed,
            String color, String obs, String allergic, String attention,
            String ownerName, String ownerNumber) {
        pet.setName(name);
        pet.setColor(color);
        pet.setBreed(breed);
        pet.setObservations(obs);
        pet.setAllergic(allergic);
        pet.setSpecialAttention(attention);
        
        // modify Pet
        persisControl.modifyNewPet(pet);
        
        Owner owner = this.searchPet(pet.getOwner().getIdOwner());
        owner.setCelOwner(ownerNumber);
        owner.setName(ownerName);
        
        // call owner modifier
        this.modifyOwner(owner);
    }

    private Owner searchPet(int idOwner) {
        return persisControl.bringOwner(idOwner);   
    }

    private void modifyOwner(Owner owner) {
        persisControl.modifyOwner(owner);
    }


}
