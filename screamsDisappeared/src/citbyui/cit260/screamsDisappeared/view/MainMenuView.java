/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import screamsdisappeared.control.GameControl;
import java.util.Scanner;
import screamsdisappeared.ScreamsDisappeared;

/**
 *
 * @author carriero
 */
public class MainMenuView {

    private String menu;
    private String promptMessage;

    public void displayMainMenuView() {

        boolean done = false; // set flag to not done
        do {

            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);

    }

    public MainMenuView() {
        this.menu = "\n"
                + "\n| Main Menu                        |"
                + "\n------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nR - Restart Saved game"
                + "\nQ - Quit"
                + "\n------------------------------------";
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
                
            }
            else
                valid=true;

        }

        return value; // return the value entered

    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // create and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                // Creat MainMenuView object
                HelpMenuView helpMenuView = new HelpMenuView();
                // Display the main menu view
                helpMenuView.displayHelpMenuView();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "R": //Menu to restart a saved game
                this.DisplayRestartGameMenu();
                // Creat RestartGameMenuView object
                RestartGameMenuView restartGameMenuView = new RestartGameMenuView();
                //Display the Restart Game Menu View
                restartGameMenuView.displayRestartGameMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(ScreamsDisappeared.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExitingGame() function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu() function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void DisplayRestartGameMenu() {
        System.out.println("\n*** RestartGameMenuView) function called ***");
    }
}
