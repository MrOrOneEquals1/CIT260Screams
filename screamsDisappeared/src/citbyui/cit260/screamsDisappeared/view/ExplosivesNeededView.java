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
import java.io.BufferedReader;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import screamsdisappeared.ScreamsDisappeared;
import screamsdisappeared.control.ExplosivesNeeded;

public class ExplosivesNeededView {

    private String display = "";
    protected final BufferedReader keyboard = ScreamsDisappeared.getInFile();
    protected final PrintWriter console = ScreamsDisappeared.getOutFile();      

    void displayExplosivesNeededView() throws CalculationControlException {
        this.console.println(display);
        displayExplosives();

    }

    public ExplosivesNeededView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n|       Explosives Needed  Description   |"
                + "\n------------------------------------------";
    }

    public void displayExplosives() throws CalculationControlException {

        boolean done = false; // set flag to not done
        try {

            this.console.println("\n Do you want to know how many explosives do you need to kill the zombies?? (Y/N)");
            String explosives = ""; //value to be returned 
            explosives = this.keyboard.readLine();
            explosives = explosives.trim();
            if (!explosives.toUpperCase().equals("Y")) // user wants to proceed
            {
                this.console.println("\n We are sad.You have chosen not to know how many explosives you need");

                return;
            } else {
                this.console.println("\n Thank you for your intersting in the game"
                                    + "\nBe careful with explosives, as you can kill"
                                    + "\nyourself if you are not careful."
                                    + "\nYou must calculate the amount of explosives to use prior their use."
                                    + "\nFind out the volume of the room and then use only 1 cubic inch for"
                                    + "\neach cubic yard of room.  (Hint: there are 27 cubic feet in 1 cubic yard)"
                                    + "\n------------------------------------------");
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

                this.console.println("\n Wow You just need " + totalExplosives + " explosives");
            }
            // do the requested action and display the next view
            GameMenuView gmv = new GameMenuView();
            
            done = gmv.doAction("Y");

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }

    }

    private int getLengthOfRoom() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int lengthOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n Please enter the length of the room");
            try {
                String lengthstring = (keyboard.next()); // get next line typed on keyboard                
                
                lengthOfRoom = parseInt(lengthstring);
                
                if (lengthOfRoom < 8 || lengthOfRoom > 16) {
              
                   throw new CalculationControlException("The length of the room has to be between 8 and 16.");
                
                }
                
                valid = true;
                
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"\nYou must enter a valid number.");
            }
            
        }
        this.console.println("\n Good job! You have entered the right value.");
        return lengthOfRoom; // return the value entered;

    }

    private int getwidthOfRoom() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int widthOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            this.console.println("Please enter the width of the room");
        try {
             
            String lengthstring = (keyboard.next()); 
            
            widthOfRoom = parseInt(lengthstring); // get next line typed on keyboard
            
            if (widthOfRoom < 11 || widthOfRoom > 15) {
                
            
            throw new CalculationControlException("The width of the room has to be between 11 and 15.");
            }

            valid = true;  // end the loop
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"\nYou must enter a valid number.");
            }
        }
        this.console.println("\n Good job! You have entered the right value.");
        return widthOfRoom; // return the value entered;

    }
    

    private int getheightOfRoom() throws CalculationControlException  {
Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int heightOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            this.console.println("Please enter the width of the room");
        try {
             
            String lengthstring = (keyboard.next()); 
            
            heightOfRoom = parseInt(lengthstring); // get next line typed on keyboard
            
            if (heightOfRoom < 15 ||heightOfRoom  > 20) {
                
            
            throw new CalculationControlException("The height of the room has to be between 15 and 20.");
            }

            valid = true;  // end the loop
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"\nYou must enter a valid number.");
            }
        }
        this.console.println("\n Good job! You have entered the right value.");
        return heightOfRoom; // return the value entered;
 
       
}
}


