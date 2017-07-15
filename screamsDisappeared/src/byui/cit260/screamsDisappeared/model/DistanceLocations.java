/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author lauravaleriogibbs
 */
public enum DistanceLocations implements Serializable {

City (50),
DesertRoad(3),
GasStation(55),
HomeLightsOn (10);

private final int distance;
private final Point coordinates;


DistanceLocations(int distance) {
    
this.distance = distance;
 
Random rand = new Random();
coordinates = new Point (rand.nextInt(10),rand.nextInt(10));


}

public int getDistance() {

return distance;

}



public Point getCoordinates() {
return coordinates;

}

@Override

public String toString() {
    String Price = null;

return name() + "    Distance = " + distance + ",    coordinates = (" + getCoordinates().x + ", "
                + getCoordinates().y + ").";

}




    
}
