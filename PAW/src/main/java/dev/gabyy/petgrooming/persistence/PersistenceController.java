package dev.gabyy.petgrooming.persistence;

import dev.gabyy.petgrooming.logic.Owner;
import dev.gabyy.petgrooming.logic.Pet;
import dev.gabyy.petgrooming.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GabyyHshss
 */
public class PersistenceController {
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void saveData(Owner owner, Pet pet) {
        ownerJpa.create(owner);
        petJpa.create(pet);
    }

    public List<Pet> bringPets() {
        return petJpa.findPetEntities();
    }

    public void deletePet(int clientId) {
        try {
            petJpa.destroy(clientId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pet bringPet(int clientId) {
        return petJpa.findPet(clientId);
    }
    public void modifyOwner(Owner owner) {
        try {
            ownerJpa.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modifyNewPet(Pet pet) {
        try {
            petJpa.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner bringOwner(int idOwner) {
        return ownerJpa.findOwner(idOwner);
    }
    
}
