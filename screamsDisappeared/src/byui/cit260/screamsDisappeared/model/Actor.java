/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;


import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author lauravaleriogibbs
 */
public enum Actor implements Serializable {
    
    private final String description;
    private final Point coordinates;
    
    public Actor() {
    }

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public String getCoordinates() {
        return coordinates;
    }


    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

}
