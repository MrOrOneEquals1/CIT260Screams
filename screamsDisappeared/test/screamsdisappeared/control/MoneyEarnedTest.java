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
public class MoneyEarnedTest {
    
    public MoneyEarnedTest() {
    }

    /**
     * Test of calcMoneyEarned method, of class MoneyEarned.
     */
    @Test
    public void testValidCalcMoneyEarned() {
        System.out.println("\tTest Case #1");
        double zombiesKilled = 15;
        double moneyPerZombie = 1.0;
        double zombieDogsKilled = 10;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = 20;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
                
        // TODO review the generated test code and remove the default call to fail.
       
        // fail("The test case is a prototype.");
        
    }
    
        @Test
     public void testValidCalcMoneyEarned2() {
        System.out.println("\tTest Case #2");
        int zombiesKilled = 0;
        double moneyPerZombie = 1.0;
        int zombieDogsKilled = 0;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = 0;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       
     }
    
    @Test
     public void testNegativeZombies() {
        System.out.println("\tTest Case #3");
        int zombiesKilled = -1;
        double moneyPerZombie = 1.0;
        int zombieDogsKilled = 10;
        double moneyPerZombieDog = 10;
        MoneyEarned instance = new MoneyEarned();
        double expResult = -1;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    @Test
    public void testNegativeZombieDogs() {
        System.out.println("\tTest Case #4");
        double zombiesKilled = 15;
        double moneyPerZombie = 1.0;
        double zombieDogsKilled = -1;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = -1;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
                
        // TODO review the generated test code and remove the default call to fail.
       
        // fail("The test case is a prototype.");
    
    }
    
    @Test
     public void testWrongZombiePrice() {
        System.out.println("\tTest Case #5");
        int zombiesKilled = 15;
        double moneyPerZombie = 2.0;
        int zombieDogsKilled = 10;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = -1;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    @Test
    public void testWrongZombieDogPrice() {
        System.out.println("\tTest Case #6");
        double zombiesKilled = 15;
        double moneyPerZombie = 1.0;
        double zombieDogsKilled = 10;
        double moneyPerZombieDog = 2.5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = -1;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
                
        // TODO review the generated test code and remove the default call to fail.
       
        // fail("The test case is a prototype.");
        
    }
    @Test
     public void testTooManyZombies() {
        System.out.println("\tTest Case #7");
        int zombiesKilled = 35;
        double moneyPerZombie = 1.0;
        int zombieDogsKilled = 10;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = -1;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
         @Test
    public void testTooManyZombieDogs() {
        System.out.println("\tTest Case #8");
        double zombiesKilled = 25;
        double moneyPerZombie = 1.0;
        double zombieDogsKilled = 35;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = -1;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
                
        // TODO review the generated test code and remove the default call to fail.
       
        // fail("The test case is a prototype.");
        
    }

    @Test
     public void testValidZombieBoundary() {
        System.out.println("\tTest Case #9");
        int zombiesKilled = 25;
        double moneyPerZombie = 1.0;
        int zombieDogsKilled = 0;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = 25;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
     
    @Test
     public void testValisZombieDogBoundary() {
        System.out.println("\tTest Case #10");
        int zombiesKilled = 0;
        double moneyPerZombie = 1.0;
        int zombieDogsKilled = 25;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = 12.5;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
     
    @Test
     public void testValidBoundary() {
        System.out.println("\tTest Case #11");
        int zombiesKilled = 25;
        double moneyPerZombie = 1.0;
        int zombieDogsKilled = 25;
        double moneyPerZombieDog = .5;
        MoneyEarned instance = new MoneyEarned();
        double expResult = 37.5;
        double result = instance.calcMoneyEarned(zombiesKilled, moneyPerZombie, zombieDogsKilled, moneyPerZombieDog);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
}

