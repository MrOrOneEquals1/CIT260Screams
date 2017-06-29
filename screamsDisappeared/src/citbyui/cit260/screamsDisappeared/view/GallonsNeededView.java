/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import screamsdisappeared.control.GallonsNeeded;


/**
 *
 * @author carriero
 */
public class GallonsNeededView extends View {

    private String display = "";

    void displayGallonsNeededView() throws CalculationControlException {
        System.out.println(display);
        displayGallonsNeededYn();
    }

    public GallonsNeededView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n| Gallons Needed                         |"
                + "\n------------------------------------------";
    }

    public void displayGallonsNeededYn() throws CalculationControlException {

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
            GameMenuView gmv = new GameMenuView();

            done = gmv.doAction("Y");

        } while (!done);

    }

    private int getMilesToNextStation() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        int milesToNextStation = 0;
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many miles is it to the next gas station?");
            try {
                String lengthstring = (keyboard.next()); // get next line typed on keyboard                

                milesToNextStation = parseInt(lengthstring);

                if (milesToNextStation < 80 || milesToNextStation > 500) {                   
              
                   throw new CalculationControlException("The miles to the next station has to be between 80 and 500");

                }

                valid = true;

            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");

            }

        }
        return milesToNextStation; // return the value entered;

    }

    private int getmpgOfCar() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int mpgOfCar = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many miles per gallon does your car get?");
            try {
                String lengthstring = (keyboard.next()); // get next line typed on keyboard                

                mpgOfCar = parseInt(lengthstring);

                if (mpgOfCar < 10 || mpgOfCar > 50) {                   
              
                   throw new CalculationControlException("The miles per gallon has to be between 10 and 50.");

                }

                valid = true;

            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");

            }

        }

        return mpgOfCar; // return the value entered;

    }

    private int getMilesRemainingOnTank() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int milesRemainingOnTank = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many miles can you drive on the gas remaining in your tank?");
            try {
                String lengthstring = (keyboard.next()); // get next line typed on keyboard                

                milesRemainingOnTank = parseInt(lengthstring);

                if (milesRemainingOnTank < 0 || milesRemainingOnTank > 20) {                   
              
                   throw new CalculationControlException("The amount of miles remaining has to be between 0 and 20.");

                }

                valid = true;

            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");

            }
            milesRemainingOnTank = keyboard.nextInt(); // get next line typed on keyboard

        }

        return milesRemainingOnTank; // return the value entered;

    }
}
