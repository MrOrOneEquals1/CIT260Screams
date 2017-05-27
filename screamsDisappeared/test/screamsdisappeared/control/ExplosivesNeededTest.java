/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lauravaleriogibbs
 */
public class ExplosivesNeededTest {
    
    public ExplosivesNeededTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcExplosivesNeeded method, of class ExplosivesNeeded.
     */
    @Test
    public void testCalcExplosivesNeeded() {
        System.out.println("Test case # 1");
        double lengthOfRoom = 8.0;
        double widthOfRoom = 11.0;
        double heightOfRoom = 15.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = 4;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testNegativeHeight() {
        System.out.println("Test case # 2");
        double lengthOfRoom = 7.0;
        double widthOfRoom = 12.0;
        double heightOfRoom = -10.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = -1;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testNegativeLenght() {
        System.out.println("Test case # 3");
        double lengthOfRoom = -15.0;
        double widthOfRoom = 12.0;
        double heightOfRoom = 16.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = -1;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpperWidth() {
        System.out.println("Test case # 4");
        double lengthOfRoom = 20.0;
        double widthOfRoom = 20.0;
        double heightOfRoom = 16.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = -1;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMinLength() {
        System.out.println("Test case # 5");
        double lengthOfRoom = 8.0;
        double widthOfRoom = 12.0;
        double heightOfRoom = 16.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = 5;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
   @Test
    public void testMinWidth() {
        System.out.println("Test case # 6");
        double lengthOfRoom = 9.0;
        double widthOfRoom = 11.0;
        double heightOfRoom = 16.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = 5;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    @Test
    public void testMinHeight() {
        System.out.println("Test case # 7");
        double lengthOfRoom = 9.0;
        double widthOfRoom = 13.0;
        double heightOfRoom = 15.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = 6;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMaxLength() {
        System.out.println("Test case # 8");
        double lengthOfRoom = 16.0;
        double widthOfRoom = 15.0;
        double heightOfRoom = 20.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = 17;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testMaxWidth() {
        System.out.println("Test case # 9");
        double lengthOfRoom = 15.0;
        double widthOfRoom = 15.0;
        double heightOfRoom = 15.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = 12;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    public void testMaxHeight() {
        System.out.println("Test case # 10");
        double lengthOfRoom = 15.0;
        double widthOfRoom = 14.0;
        double heightOfRoom = 20.0;
        ExplosivesNeeded instance = new ExplosivesNeeded();
        double expResult = 15;
        double result = instance.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
