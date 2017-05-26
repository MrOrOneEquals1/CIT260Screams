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
 * @author David Vera
 */
public class TripNeededTest {
    
    public TripNeededTest() {
    }

    /**
     * Test of calcTripNeeded method, of class TripNeeded.
     */
    @Test
    public void testCalcTripNeededValid() {
        System.out.println("Test Case # 1");
        double gallonsNeeded = 13.0;
        double litersNeeded = 49.21;
        double bottlePerTrip = 1.0;
        TripNeeded instance = new TripNeeded();
        double expResult = 24.61;
        double result = instance.calcTripNeeded(gallonsNeeded, litersNeeded, bottlePerTrip);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalcTripNeededInvalid1() {
        System.out.println("Test Case # 2");
        double gallonsNeeded = 16.0;
        double litersNeeded = 60.57;
        double bottlePerTrip = 1.0;
        TripNeeded instance = new TripNeeded();
        double expResult = -1;
        double result = instance.calcTripNeeded(gallonsNeeded, litersNeeded, bottlePerTrip);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalcTripNeededInvalid2() {
        System.out.println("Test Case # 3");
        double gallonsNeeded = -10.0;
        double litersNeeded = -37.85;
        double bottlePerTrip = 1.0;
        TripNeeded instance = new TripNeeded();
        double expResult = -1;
        double result = instance.calcTripNeeded(gallonsNeeded, litersNeeded, bottlePerTrip);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalcTripNeededInvalid3() {
        System.out.println("Test Case # 4");
        double gallonsNeeded = 10.0;
        double litersNeeded = 37.85;
        double bottlePerTrip = 3.0;
        TripNeeded instance = new TripNeeded();
        double expResult = -1;
        double result = instance.calcTripNeeded(gallonsNeeded, litersNeeded, bottlePerTrip);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalcTripNeededBoundary1() {
        System.out.println("Test Case # 5");
        double gallonsNeeded = 15.0;
        double litersNeeded = 56.78;
        double bottlePerTrip = 1.0;
        TripNeeded instance = new TripNeeded();
        double expResult = 28.39;
        double result = instance.calcTripNeeded(gallonsNeeded, litersNeeded, bottlePerTrip);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalcTripNeededBoundary2() {
        System.out.println("Test Case # 6");
        double gallonsNeeded = 2.0;
        double litersNeeded = 7.57;
        double bottlePerTrip = 1.0;
        TripNeeded instance = new TripNeeded();
        double expResult = 3.79;
        double result = instance.calcTripNeeded(gallonsNeeded, litersNeeded, bottlePerTrip);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalcTripNeededBoundary3() {
        System.out.println("Test Case # 7");
        double gallonsNeeded  = 14.0;
        double litersNeeded = 53.0;
        double bottlePerTrip = 1.0;
        TripNeeded instance = new TripNeeded();
        double expResult = 26.50;
        double result = instance.calcTripNeeded(gallonsNeeded, litersNeeded, bottlePerTrip);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
