package dev.gabyy.petgrooming.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author GabyyHshss
 */

@Entity
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idOwner;
    
    private String name;
    private String celOwner;
    
    public Owner() {
    }

    public Owner(int idOwner, String name, String celOwner) {
        this.idOwner = idOwner;
        this.name = name;
        this.celOwner = celOwner;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCelOwner() {
        return celOwner;
    }

    public void setCelOwner(String celOwner) {
        this.celOwner = celOwner;
    }
    
}
