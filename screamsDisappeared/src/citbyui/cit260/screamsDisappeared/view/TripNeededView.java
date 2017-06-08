/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;
import screamsdisappeared.control.TripNeeded;

/**
 *
 * @author David Vera
 */
public class TripNeededView {
     private String display="";

    void displayTripNeededView() {
        System.out.println(display);
        displaytripNeededView();
    }

    public TripNeededView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n| Trips to the gas station you need                           |"
                + "\n------------------------------------------";
    }

    public void displaytripNeededView() {

        boolean done = false; // set flag to not done
        do {

            System.out.println("\n Do you want to get gas for the car? (Y/N)");
            Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
            String tripNeededView = ""; //value to be returned 
            tripNeededView = keyboard.nextLine();
            tripNeededView = tripNeededView.trim();
            if (!tripNeededView.toUpperCase().equals("Y")) // user wants to proceed
            {
                return;
            } else {

                int gallonsNeeded = gallonsNeeded();

                int bottlePerTrip = bottlePerTrip();
                
                int litersNeeded = litersNeeded();

                TripNeeded tripNeeded = new TripNeeded();

                double trips = tripNeeded.calcTripNeeded(gallonsNeeded,litersNeeded, bottlePerTrip);

                System.out.println("\nYou have to make " + trips + " trips");
            }
            // do the requested action and display the next view
            HelpMenuView helpMenuV = new HelpMenuView();
            
            done = helpMenuV.doAction("L");

        } while (!done);

    }

    private int gallonsNeeded() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int gallonsNeeded = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n Enter the number of gallons");

            gallonsNeeded = keyboard.nextInt(); // get next line typed on keyboard
            if (gallonsNeeded < 0 ) {  //the numbers of gallos are out of range
                System.out.println("\nInvalid value: value cannot be negative");
                return -1;
            }            
             if (gallonsNeeded > 15) {  //gallons needed are more than 15
                System.out.println("\nInvalid value: value cannot be more than 15");
                return -1;
            }
            break;  // end the loop
        }
        return gallonsNeeded; // return the value entered;

    }
    
        

    
    private int litersNeeded() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        double litersNeeded = 0.0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n enter the numbers of liters needed, multiply gallons by 3");

            litersNeeded = keyboard.nextInt(); // get next line typed on keyboard

            if (litersNeeded < 0) {  //numbers of the liters is out of range
                System.out.println("\nInvalid value: value cannot be negative");
                return -1;
            }            
                if (litersNeeded > 56) {  //liters needed are more than 56
                System.out.println("\nInvalid value: value cannot be more than 56");
                return -1;
            }
        break;  // end the loop
        
        }
        
        return (int) litersNeeded; // return the value entered;

    }
    
     private int bottlePerTrip() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int bottlePerTrip = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many bottles do you have?");

            bottlePerTrip = keyboard.nextInt(); // get next line typed on keyboard

            if (bottlePerTrip < 0) {  //numbers of the botles are out of range
                System.out.println("\nInvalid value: value cannot be negative");
                return -1;
                
            }
            if (bottlePerTrip > 2) {  //botles are more than 2
                System.out.println("\nInvalid value: value cannot be more than 2");
                return -1;
            }
        break;  // end the loop
        
        }
        
        return bottlePerTrip; // return the value entered;

    }

}
