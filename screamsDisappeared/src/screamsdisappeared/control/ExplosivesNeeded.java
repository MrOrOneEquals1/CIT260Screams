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
 * @author lauravaleriogibbs
 */
public class ExplosivesNeeded {

    double lengthOfRoom = 0;
    double widthOfRoom = 0;
    double heightOfRoom = 0;

    public static double calcExplosivesNeeded(double lengthOfRoom, double widthOfRoom, double heightOfRoom) throws CalculationControlException {

//        if (lengthOfRoom < 8 || lengthOfRoom > 16) {
//            
//            throw new CalculationControlException("The length of the room has to be between 8 and 16.");
//                        
//        }
//
//        if (widthOfRoom < 11 || widthOfRoom > 15) {
//            throw new CalculationControlException("The width of the room has to be between 11 and 15.");
//        }
//
//        if (heightOfRoom < 15 || heightOfRoom > 20) {
//            throw new CalculationControlException("The height of the room has to be between 15 and 20.");
//        }

        double cubicYardsOfVolume = lengthOfRoom * widthOfRoom * heightOfRoom / 27;//Cubic feet to cubic yards
        double explosivesNeeded = (Math.round(cubicYardsOfVolume) / 10);//1 explosive per every 10 cubic yards
        return explosivesNeeded;

    }
}
