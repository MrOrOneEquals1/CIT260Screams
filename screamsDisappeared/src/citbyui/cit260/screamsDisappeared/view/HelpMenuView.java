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
public class HelpMenuView {

    private String menu;
    private String promptMessage;

    public HelpMenuView() {
        this.menu = "\n"
                + "\n---------------------------------------"
                + "\n| Help Menu                           |"
                + "\n---------------------------------------"
                + "\nD - Game Description"
                + "\nS - Scene Description"
                + "\nL - Location Menu"
                + "\nR - Resource Information"
                + "\nE - How to Earn Money"
                + "\nM - Main Menu"
                + "\nG - Game Menu"
                + "\n---------------------------------------";
    }

    public void displayHelpMenuView() {

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
            case "D": // Display Description of Game
                this.startGameDescription();
                break;
            case "S": // Display Description of Game
                this.startSceneDescription();
                break;
            case "L": // Display Description of Game
                this.locationMenuView();
                // Creat MainMenuView object
                LocationMenuView locationMenuView = new LocationMenuView();

                // Display the main menu view
                locationMenuView.displayLocationMenuView();
                break;
             case "G": // Display Game Menu
                this.gameMenuView();
                // Create GameMenuView object
                GameMenuView gameMenuView = new GameMenuView();

                // Display the game menu view
                gameMenuView.displayGameMenuView();
                break;   
            case "R": // Display Description of Game
                this.startResourceInformation();
                break;
            case "E": // Display Description of Game
                this.startEarnMoney();
                break;
            case "M": // Return to MainMenu
                this.mainMenuView();
                // Creat MainMenuView object
                MainMenuView mainMenuView = new MainMenuView();

                // Display the main menu view
                mainMenuView.displayMainMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void startGameDescription() {
        System.out.println("\n*** GameDescription function called ***");
    }

    private void mainMenuView() {
        System.out.println("\n*** Main Menu function called ***");
    }

    private void startSceneDescription() {
        System.out.println("\n*** SceneDescription function called ***");
    }

    private void startResourceInformation() {
        System.out.println("\n*** ResourceInformation function called ***");
    }

    private void startEarnMoney() {
        System.out.println("\n*** EarnMoney function called ***");
    }

    private void locationMenuView() {
        System.out.println("\n*** LocationMenu function called ***");
    }
    private void gameMenuView() {
        System.out.println("\n*** GameMenu function called ***");
    }

}
