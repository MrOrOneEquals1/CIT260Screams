/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;

/**
 *
 * @author David Vera
 */
public class RestartGameMenuView {
    
    private String menu;
    private String promptMessage;

    public RestartGameMenuView() {
        this.menu = "\n"
                + "\n---------------------------------------"
                + "\n| Please select from the following saved games:   |"
                + "\n---------------------------------------"
                + "\nA "
                + "\nB "
                + "\nC "
                + "\nD "
                + "\nE "
                + "\nM - Return to the Main Menu"
                + "\n---------------------------------------";
    }

    public void displayRestartGameMenuView() {

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
        promptMessage = "Please make your selection from the menu above.";
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

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
        

        boolean rtnValue = true;

        switch (choice) {
            case "A": // Restart the A saved game
                this.startGameSavedA();
                break;
            case "B": // Restart the B saved game
                this.startGameSavedB();
                break;
            case "C": // Restart the C saved game
                this.startGameSavedC();
                break;
            case "D": // Restart the D saved game
                this.startGameSavedD();
                break;
            case "E": // Restart the E saved game
                this.startGameSavedE();
                break;
            case "M": // Return to MainMenu
                this.mainMenuView();
                // Creat MainMenuView object
                MainMenuView mainMenuView = new MainMenuView();

                // Display the main menu view
                mainMenuView.displayMainMenuView();
                break;
             
            default:
                System.out.println("\n*** “If you don’t see your game listed here, then return to the Main Menu and start a new game");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void startGameSavedA() {
        System.out.println("\n*** startGameSaved1 function called ***");
    }

    private void startGameSavedB() {
        System.out.println("\n*** startGameSaved2 function called ***");
    }

    private void startGameSavedC() {
        System.out.println("\n*** startGameSaved3 function called ***");
    }

    private void startGameSavedD() {
        System.out.println("\n*** startGameSaved4 function called ***");
    }

    private void startGameSavedE() {
        System.out.println("\n*** startGameSaved5 function called ***");
    }

    private void mainMenuView() {
        System.out.println("\n*** mainMenuView function called ***");
    }
    
}
