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
public class LocationMenuView {
    
    private String menu;
    private String promptMessage;

    public LocationMenuView() {
        this.menu = "\n"
                + "\n------------------------------------------"
                + "\n| Location Menu                           |"
                + "\n------------------------------------------"
                + "\nD - Scene Description"
                + "\nL - Leave this Scene"
                + "\nP - Pick Up Object and Put It In Backpack"
                + "\nU - Use Object from Backpack"
                + "\nM - Main Menu"
                + "\n------------------------------------------";
    }

    public void displayLocationMenuView() {

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
                this.startSceneDescription();
                break;
            case "L": // Display Description of Game
                this.startLeaveScene();
                break;
            case "P": // Display Description of Game
                this.startPickUpObject();
                break;
            case "U": // Display Description of Game
                this.startUseObject();
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

    private void startSceneDescription() {
        System.out.println("\n*** SceneDescription function called ***");
    }

    private void startLeaveScene() {
        System.out.println("\n*** LeaveScene function called ***");
    }

    private void startPickUpObject() {
        System.out.println("\n*** PickUpObject function called ***");
    }

    private void startUseObject() {
        System.out.println("\n*** UseObject function called ***");
    }

    private void mainMenuView() {
        System.out.println("\n*** MainMenu function called ***");
    }

}
