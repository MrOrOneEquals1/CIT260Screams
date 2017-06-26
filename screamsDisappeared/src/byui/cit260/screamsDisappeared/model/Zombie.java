/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;


import java.io.Serializable;
import java.util.Objects;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author lauravaleriogibbs
 */
public enum Zombie implements Serializable {
    
    John("Smart, strong"),
    Sarah("Intuitive"),
    Sam("Quick"),
    Herman("Smart"),
    James("Strong"),
    Samantha("Can't walk"),
    Theresa("Lazy"),
    Franklin("Useless"),
    Libby("Dumb"),
    Brian("Doesn't understand English"),
    Abigail("Is a good hider"),
    Charles("Tells funny jokes before he eats you"),
    Oliver("Cries a lot"),
    Cleopatra("Bald"),
    Blair("Grumpy"),
    Scott("Bashful"),
    Lori("Dopey"),
    Heidi("Sleepy"),
    Stuart("Runs fast"),
    Kelsy("Very slow"),
    Cameron("Heavy"),
    Dana("Has turned others to Zombies"),
    Callie("Mean and Nasty"),
    DD("Wants to fight"),
    Kayla("Hungry for food");
    
    
    private final String description;
    private final Point coordinates;
    
       Zombie(String description) {
        this.description = description;
        Random rand = new Random();
        coordinates = new Point (rand.nextInt(9),rand.nextInt(9));
    }

 
       public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }


    @Override
    public String toString() {
        return name() + "    Description = " + description + ",    coordinates = (" + getCoordinates().x + ", "
                + getCoordinates().y + ").";
    }

    

}
