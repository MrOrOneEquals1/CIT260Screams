/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;
/**
 *
 * @author David Vera
 */
public class TripNeeded {
    
    public double calcTripNeeded (double gallonsNeeded, double litersNeeded , double bottlePerTrip) {
        
        if (gallonsNeeded < 0 || gallonsNeeded > 15){ //Gallons needed are out of range
            return -1;
        }
            
        if (litersNeeded < 0 || litersNeeded > 56.78) { //Liter needed are out of range
            return -1;
        }
    
        if (bottlePerTrip < 0 || bottlePerTrip > 2) { //Bottle per trip are out of range
            return -1;
        }
    
        double literNeeded = gallonsNeeded*3.7854118;
        double numbersOfTrip = Math.round((literNeeded/(bottlePerTrip*2))*100)/100.0;//Each bottle will have a capacity of two liters, and the user only can carry up to two bottles per trip
        return numbersOfTrip;
    }
}
