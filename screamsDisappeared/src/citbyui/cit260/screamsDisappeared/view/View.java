/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;

/**
 *
 * @author carriero
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user want to quit
            {
                return; //exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        System.out.println ("\n Test1");
        String value = ""; //value to be returned
        boolean valid = false; // initialize to not valid
        
        while(!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nI*** You must enter a value ***");
                continue;
            }
        
        break;  // end the loop
        
        }
    
    return value; // return the value entered
    
    }
}

