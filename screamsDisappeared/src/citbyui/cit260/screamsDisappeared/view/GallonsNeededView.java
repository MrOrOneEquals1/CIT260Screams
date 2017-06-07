/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;
import screamsdisappeared.control.GallonsNeeded;

/**
 *
 * @author David Vera
 */
public class GallonsNeededView {
    
    private String menu;
    private String promptMessage;

    public GallonsNeededView() {
        this.menu = "\n"
                + "\n---------------------------------------"
                + "\n| Please enter the numbers of gallons needed   |"
                + "\n---------------------------------------"
                + "\n---------------------------------------";
    }

    public void displayGallonsNeededView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);

    }

    private String getMenuOption() {

        System.out.println(menu);

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; // initialize to not valid
        promptMessage = "";
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }

            break;  // end the loop

        }

        return value; // return the value entered

    }

    public boolean doAction(int GallonsNeeded) {      
        
        GallonsNeeded gallonsNeeded = new GallonsNeeded();
        return true;
    }

    private boolean doAction(String menuOption) {
       System.out.println("\nto Test");
        return true;
    }
}