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
public enum Weapons implements Serializable {

Machete (2),
Pistol(3),
Knife(1),
Rifle(1),
Explosives(5),
Acid(2),
PoisonGas(3),
Axe(1),
Hammer(4),
AnElectricChainsaw(5);

private final int price;
private final Point coordinates;


Weapons(int price) {
    
this.price = price;
 
Random rand = new Random();
coordinates = new Point (rand.nextInt(10),rand.nextInt(10));


}

public int getPrice() {

return price;

}



public Point getCoordinates() {
return coordinates;

}

@Override

public String toString() {
    String Price = null;

return name() + "    Price = " + price + ",    coordinates = (" + getCoordinates().x + ", "
                + getCoordinates().y + ").";

}




    
}
