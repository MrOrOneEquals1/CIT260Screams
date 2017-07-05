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

    public double calcMoneyEarned(double zombiesKilled, double zombieDogsKilled) {
        double moneyPerZombie = 1.0;
        double moneyPerZombieDog = 0.5;

        double moneyFromZombies = (zombiesKilled * moneyPerZombie);
        double moneyFromZombieDogs = (zombieDogsKilled * moneyPerZombieDog);

        double moneyEarned = moneyFromZombies + moneyFromZombieDogs;
        return moneyEarned;

    }

}
