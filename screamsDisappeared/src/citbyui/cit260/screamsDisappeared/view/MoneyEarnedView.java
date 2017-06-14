/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;
import screamsdisappeared.control.MoneyEarned;

/**
 *
 * @author carriero
 */
public class MoneyEarnedView {

    private String display="";

    void displayMoneyEarnedView() {
        System.out.println(display);
        displayZombiesKilledYn();
    }

    public MoneyEarnedView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n| Money Earned                           |"
                + "\n------------------------------------------";
    }

    public void displayZombiesKilledYn() {

        boolean done = false; // set flag to not done
        do {

            System.out.println("\n Do you want to get money for the Zombies and Zombiedogs? (Y/N)");
            Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
            String zombiesKilledYn = ""; //value to be returned 
            zombiesKilledYn = keyboard.nextLine();
            zombiesKilledYn = zombiesKilledYn.trim();
            if (!zombiesKilledYn.toUpperCase().equals("Y")) // user wants to proceed
            {
                return;
            } else {

                int zombiesKilled = getZombiesKilled();

                int zombieDogsKilled = getZombieDogsKilled();

                MoneyEarned moneyEarned = new MoneyEarned();

                double dollars = moneyEarned.calcMoneyEarned(zombiesKilled, zombieDogsKilled);

                System.out.println("\nYou have earned " + dollars + " dollars");
            }
            // do the requested action and display the next view
            HelpMenuView hmv = new HelpMenuView();
            
            done = hmv.doAction("L");

        } while (!done);

    }

    private int getZombiesKilled() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        int zombiesKilled = 0;
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many Zombies did you kill?");

            zombiesKilled = keyboard.nextInt(); // get next line typed on keyboard
            if (zombiesKilled < 0) {  //zombies killed is negative
                System.out.println("\nInvalid value: value cannot be negative");
                return -1;
            }

            if (zombiesKilled > 25) {  //zombies killed is more than 25
                System.out.println("\nInvalid value: value cannot be more than 25");
                return -1;
            }
            break;  // end the loop
        }
        return zombiesKilled; // return the value entered;

    }

    private int getZombieDogsKilled() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int zombieDogsKilled = 0;       
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many ZombieDogs did you kill?");

            zombieDogsKilled = keyboard.nextInt(); // get next line typed on keyboard

            if (zombieDogsKilled < 0) {  //zombieDogs killed is negative
                System.out.println("\nInvalid value: value cannot be negative");
                return -1;
            }

            if (zombieDogsKilled > 25) {  //zombieDogs killed is more than 25
                System.out.println("\nInvalid value: value cannot be more than 25");
                return -1;
            }

        break;  // end the loop
        
        }
        
        return zombieDogsKilled; // return the value entered;

    }

}
