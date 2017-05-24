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
    
    public double calcMoneyEarned (double zombiesKilled, double moneyPerZombie, double zombieDogsKilled, double moneyPerZombieDog) {
        
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

        if (moneyPerZombie != 1) {  //You only get 1 for a zombie
            return -1;
        }

        if (moneyPerZombieDog != .5) {  //You only get .50 for a zombieDog
            return -1;
        }

        double moneyFromZombies = (zombiesKilled * moneyPerZombie);
        double moneyFromZombieDogs = (zombieDogsKilled * moneyPerZombieDog);

        double moneyEarned = moneyFromZombies + moneyFromZombieDogs;
        return moneyEarned;
        

    }
    
}
