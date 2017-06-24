/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;


import java.io.Serializable;
import java.util.Objects;
import java.awt.Point;
/**
 *
 * @author lauravaleriogibbs
 */
public enum Actor implements Serializable {
    
    John("Smart, strong"),
    Sarah("Intuitive"),
    Sam("Quick"),
    Herman("Smart"),
    James("Strong"),
    Samantha("Good Information"),
    Theresa("Lazy"),
    Franklin("Unhelpful");
    
    
    
    private final String description;
    private final Point coordinates;
    
       Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }


    @Override
    public String toString() {
        return "Actor{ description=" + description + ", coordinates=" + coordinates +"}";
    }

}
