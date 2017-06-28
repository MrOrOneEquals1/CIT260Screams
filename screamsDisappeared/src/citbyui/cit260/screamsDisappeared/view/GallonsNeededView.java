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
public class GallonsNeededView {
    private String display="";

    void displayGallonsNeededView() {
        System.out.println(display);
        gallonsNeededYn();
    }

    public GallonsNeededView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n| Gallons Needed                         |"
                + "\n------------------------------------------";
    }

    public void gallonsNeededYn() {

        boolean done = false; // set flag to not done
        do {

            System.out.println("\n Do you want to calculate how many gallons are needed? (Y/N)");
            Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
            String gallonsNeededYn = ""; //value to be returned 
            gallonsNeededYn = keyboard.nextLine();
            gallonsNeededYn = gallonsNeededYn.trim();
            if (!gallonsNeededYn.toUpperCase().equals("Y")) // user wants to proceed
            {
                return;
            } else {

                int milesToNextStation = getMilesToNextStation();

                int mpgOfCar = getmpgOfCar();
                
                int milesRemainingOnTank = getMilesRemainingOnTank();

                GallonsNeeded gallonsNeeded = new MoneGallonsNeededyEarned();

                double gallons = gallonsNeeded.calcGallonsNeeded(milesToNextStation, mpgOfCar, milesRemainingOnTank);

                System.out.println("\nYou need to get " + gallons + " gallons before you can leave the town and drive to the safety of another city.");
            }
            // do the requested action and display the next view
            CalculationsMenuView cmv = new CalculationsMenuView();
            
            done = cmv.doAction("M");

        } while (!done);

    }

    private int getMilesToNextStation() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        int milesToNextStation = 0;
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many miles is it to the next gas station?");

            milesToNextStation = keyboard.nextInt(); // get next line typed on keyboard
            if (milesToNextStation < 0) {  //zombies killed is negative
                System.out.println("\nThe miles to the next station cannot be negative");
                return -1;
            }

            if (milesToNextStation > 500) {  //zombies killed is more than 25
                System.out.println("\nInvalid value: value cannot be more than 500");
                return -1;
            }
            break;  // end the loop
        }
        return milesToNextStation; // return the value entered;

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
