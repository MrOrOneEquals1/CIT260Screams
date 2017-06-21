/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;
import java.io.Serializable;
/**
 *
 * @author lauravaleriogibbs
 */
public class Car implements Serializable {
    
    
    
    private double milesPerGallon;
    private double tankSize;
    

    
    
    public Car() {
       this.milesPerGallon = 0;
       this.tankSize = 0;
        
        
    }
    
    
    

    public double getDrivenMiles() {
        return milesPerGallon;
    }

    public void setDrivenMiles(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.milesPerGallon) ^ (Double.doubleToLongBits(this.milesPerGallon) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.tankSize) ^ (Double.doubleToLongBits(this.tankSize) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Car{" + "milesPerGallon=" + milesPerGallon + ", tankSize=" + tankSize + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        return true;
    }
    
    
}
