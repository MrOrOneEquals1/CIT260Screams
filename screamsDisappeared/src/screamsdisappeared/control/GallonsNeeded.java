/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;

/**
 *
 * @author Darin
 */
public class GallonsNeeded {
    
    public double calcGallonsNeeded (double milesRemainingOnTank, double milesToNextStation, double mpgOfCar) {
    
    if (milesRemainingOnTank < 0) {
        return -1;     
    }
 
    if (milesToNextStation < 0) {
        return -1;
    }
         
    if (mpgOfCar<10 || mpgOfCar>40) {
        return -1;
    }
 
    double milesToDrive = (milesToNextStation - milesRemainingOnTank);
    double gallonsNeeded = Math.round(milesToDrive / mpgOfCar * 10)/10.0;
    return gallonsNeeded;

}
    
}
