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
public class MoneyEarned {
    
    public double calcMoneyEarned (double zombiesKilled, double zombieDogsKilled) {
        double moneyPerZombie = 1.0;
        double moneyPerZombieDog=0.5;
        
        if (zombiesKilled<0) {  //zombies killed is negative
            return -1;
        }

        if (zombiesKilled>25) {  //zombies killed is more than 25
            return -1;
        }

        if (zombieDogsKilled<0) {  //zombieDogs killed is negative
            return -1;
        }
        
        if (zombieDogsKilled>25) {  //zombieDogs killed is more than 25
            return -1;
        }

        double moneyFromZombies = (zombiesKilled * moneyPerZombie);
        double moneyFromZombieDogs = (zombieDogsKilled * moneyPerZombieDog);

        double moneyEarned = moneyFromZombies + moneyFromZombieDogs;
        return moneyEarned;
        

    }
    
}
