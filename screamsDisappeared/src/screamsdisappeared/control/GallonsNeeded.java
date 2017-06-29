/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;

import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darin
 */
public class GallonsNeeded {
    
    public double calcGallonsNeeded (double milesToNextStation, double mpgOfCar, double milesRemainingOnTank) {
    
//    if (milesRemainingOnTank < 0) {
//        try {     
//            throw new CalculationControlException("The miles remaining on tank cannot be negative.");
//        } catch (CalculationControlException ex) {
//            Logger.getLogger(GallonsNeeded.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
// 
//    if (milesToNextStation < 0) {
//        return -1;
//    }
//         
//    if (mpgOfCar<10 || mpgOfCar>40) {
//        return -1;
//    }
 
    double milesToDrive = (milesToNextStation - milesRemainingOnTank);
    double gallonsNeeded = Math.round(milesToDrive / mpgOfCar * 10)/10.0;
    return gallonsNeeded;

}
    
}
