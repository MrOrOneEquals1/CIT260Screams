/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package citbyui.cit260.screamsDisappeared.view;
///import java.util.Scanner;
//import screamsdisappeared.control.GameControl;
//import byui.cit260.screamsDisappeared.model.Player;
/**
 *
 * @author lauravaleriogibbs
 */
package citbyui.cit260.screamsDisappeared.view;

import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import screamsdisappeared.control.ExplosivesNeeded;

public class ExplosivesNeededView {

    private String display = "";

    void displayExplosivesNeededView() throws CalculationControlException {
        System.out.println(display);
        displayExplosives();

    }

    public ExplosivesNeededView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n|       Explosives Needed                   |"
                + "\n------------------------------------------";
    }

    public void displayExplosives() throws CalculationControlException {

        boolean done = false; // set flag to not done
        do {

            System.out.println("\n Do you want to know how many explosives do you need to kill the zombies?? (Y/N)");
            Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
            String explosives = ""; //value to be returned 
            explosives = keyboard.nextLine();
            explosives = explosives.trim();
            if (!explosives.toUpperCase().equals("Y")) // user wants to proceed
            {
                System.out.println("\n We are sad.You have chosen not to know how many explosives you need");

                return;
            } else {
                System.out.println("\n Thank you for your intersting in the game");
            }
            {

                int lengthOfRoom = 0;
                int widthOfRoom = 0;
                int heightOfRoom = 0;

                lengthOfRoom = getLengthOfRoom();
                widthOfRoom = getwidthOfRoom();
                heightOfRoom = getheightOfRoom();
                ExplosivesNeeded explosivesNeeded = new ExplosivesNeeded();

                double totalExplosives = explosivesNeeded.calcExplosivesNeeded(lengthOfRoom, widthOfRoom, heightOfRoom);

                System.out.println("\n Wow You just need " + totalExplosives + " explosives");
            }
            // do the requested action and display the next view
            CalculationsMenuView cmv = new CalculationsMenuView();
            
            done = cmv.doAction("M");

        } while (!done);

    }

    private int getLengthOfRoom() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int lengthOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n Please enter the length of the room");
            try {
                String lengthstring = (keyboard.next()); // get next line typed on keyboard                
                
                lengthOfRoom = parseInt(lengthstring);
                
                if (lengthOfRoom < 8 || lengthOfRoom > 16) {
              
                   throw new CalculationControlException("The length of the room has to be between 8 and 16.");
                
                }
                
                valid = true;
                
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");
            }
            
        }
        System.out.println("\n Good job! You have entered the right value.");
        return lengthOfRoom; // return the value entered;

    }

    private int getwidthOfRoom() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int widthOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("Please enter the width of the room");
        try {
             
            String lengthstring = (keyboard.next()); 
            
            widthOfRoom = parseInt(lengthstring); // get next line typed on keyboard
            
            if (widthOfRoom < 11 || widthOfRoom > 15) {
                
            
            throw new CalculationControlException("The width of the room has to be between 11 and 15.");
            }

            valid = true;  // end the loop
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");
            }
        }
        System.out.println("\n Good job! You have entered the right value.");
        return widthOfRoom; // return the value entered;

    }
    

    private int getheightOfRoom() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int heightOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n Please enter the height of the room");

            heightOfRoom = keyboard.nextInt(); // get next line typed on keyboard

            break;  // end the loop
        }
        System.out.println("\n Good job! You have entered the right value");
        return heightOfRoom; // return the value entered;

    }
}


