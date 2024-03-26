package dev.gabyy.petgrooming.persistence;

import dev.gabyy.petgrooming.logic.Owner;
import dev.gabyy.petgrooming.logic.Pet;

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
    
}
