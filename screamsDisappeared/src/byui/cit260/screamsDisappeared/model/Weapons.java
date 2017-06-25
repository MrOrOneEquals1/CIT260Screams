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
Knife(4),
Rifle(2),
Explosives(1),
Acid(2),
PoisonGas(3),
Axe(1),
Hammer(4),
AnElectricChainsaw(5), 
;

public final int price;
private final Point coordinates;


Weapons(int price) {
    
this.price = price ;

Random rand = new Random();
coordinates = new Point (rand.nextInt(10),rand.nextInt(10));


}

public int getPrice() {

return this.price;

}



public Point getCoordinates() {
return coordinates;

}

@Override

public String toString() {

return "Actor{ price=" + price + ", coordinates=" + coordinates +

"}";

}




    
}
