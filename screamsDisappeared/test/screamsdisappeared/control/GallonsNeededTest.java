/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darin
 */
public class GallonsNeededTest {
    
    public GallonsNeededTest() {
    }

    /**
     * Test of calcGallonsNeeded method, of class GallonsNeeded.
     */
    @Test
    public void testValidCalcGallonsNeeded() {
        System.out.println("Test Case #1");
        double milesRemainingOnTank = 10;
        double milesToNextStation = 189;
        double mpgOfCar = 24;
        GallonsNeeded instance = new GallonsNeeded();
        double expResult = 7.5;
        double result = instance.calcGallonsNeeded(milesRemainingOnTank, milesToNextStation, mpgOfCar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
       public void testLowMpg() {
        System.out.println("Test Case #2");
        double milesRemainingOnTank = 15;
        double milesToNextStation = 150;
        double mpgOfCar = 5;
        GallonsNeeded instance = new GallonsNeeded();
        double expResult = -1;
        double result = instance.calcGallonsNeeded(milesRemainingOnTank, milesToNextStation, mpgOfCar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    @Test
    public void testHighMpg() {
        System.out.println("Test Case #3");
        double milesRemainingOnTank = 10;
        double milesToNextStation = 189;
        double mpgOfCar = 90;
        GallonsNeeded instance = new GallonsNeeded();
        double expResult = -1;
        double result = instance.calcGallonsNeeded(milesRemainingOnTank, milesToNextStation, mpgOfCar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
       public void testNegativeMilesRemaining() {
        System.out.println("Test Case #4");
        double milesRemainingOnTank = -150;
        double milesToNextStation = 120;
        double mpgOfCar = 20;
        GallonsNeeded instance = new GallonsNeeded();
        double expResult = -1;
        double result = instance.calcGallonsNeeded(milesRemainingOnTank, milesToNextStation, mpgOfCar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    @Test
    public void testNegativeMilesToStation() {
        System.out.println("Test Case #5");
        double milesRemainingOnTank = 15;
        double milesToNextStation = -200;
        double mpgOfCar = 30;
        GallonsNeeded instance = new GallonsNeeded();
        double expResult = -1;
        double result = instance.calcGallonsNeeded(milesRemainingOnTank, milesToNextStation, mpgOfCar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
       public void testUpperMpg() {
        System.out.println("Test Case #6");
        double milesRemainingOnTank = 25;
        double milesToNextStation = 100;
        double mpgOfCar = 1.88;
        GallonsNeeded instance = new GallonsNeeded();
        double expResult = -1;
        double result = instance.calcGallonsNeeded(milesRemainingOnTank, milesToNextStation, mpgOfCar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 

    @Test
    public void testLowerMpg() {
        System.out.println("Test Case #7");
        double milesRemainingOnTank = 0;
        double milesToNextStation = 300;
        double mpgOfCar = 10;
        GallonsNeeded instance = new GallonsNeeded();
        double expResult = 30;
        double result = instance.calcGallonsNeeded(milesRemainingOnTank, milesToNextStation, mpgOfCar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
          @Test
    public void testUpperMilesRemainingMpg() {
        System.out.println("Test Case #8");
        double milesRemainingOnTank = 25;
        double milesToNextStation = 100;
        double mpgOfCar = 10;
        GallonsNeeded instance = new GallonsNeeded();
        double expResult = 7.5;
        double result = instance.calcGallonsNeeded(milesRemainingOnTank, milesToNextStation, mpgOfCar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
}
