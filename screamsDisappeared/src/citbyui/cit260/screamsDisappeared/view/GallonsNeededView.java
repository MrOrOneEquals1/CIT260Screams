/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;
import screamsdisappeared.control.GallonsNeeded;
import screamsdisappeared.control.MoneyEarned;

/**
 *
 * @author carriero
 */
public class GallonsNeededView extends View{
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

                GallonsNeeded gallonsNeeded = new GallonsNeeded();

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

    private int getmpgOfCar() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int mpgOfCar = 0;       
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many miles per gallon does your car get?");

            mpgOfCar = keyboard.nextInt(); // get next line typed on keyboard

            if (mpgOfCar < 10) {  //zombieDogs killed is negative
                System.out.println("\nYour car has to get better than 10 mpg.");
                return -1;
            }

            if (mpgOfCar > 50) {  //zombieDogs killed is more than 25
                System.out.println("\nLet's be honest, no car gets over 50 mpg.");
                return -1;
            }

        break;  // end the loop
        
        }
        
        return mpgOfCar; // return the value entered;

    }
    
        private int getMilesRemainingOnTank() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int milesRemainingOnTank = 0;       
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many miles per gallon does your car get?");

            milesRemainingOnTank = keyboard.nextInt(); // get next line typed on keyboard

            if (milesRemainingOnTank < 0) {  //zombieDogs killed is negative
                System.out.println("\nYour value has to be non-negative.");
                return -1;
            }

            if (milesRemainingOnTank > 20) {  //zombieDogs killed is more than 25
                System.out.println("\nYou have to have less than 20 miles left on the tank.");
                return -1;
            }

        break;  // end the loop
        
        }
        
        return milesRemainingOnTank; // return the value entered;

    }
}
