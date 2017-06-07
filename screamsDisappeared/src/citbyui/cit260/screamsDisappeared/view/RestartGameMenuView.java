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
            case "A": // Restart the 1 saved game
                this.startGameSaved1();
                break;
            case "B": // Restart the 2 saved game
                this.startGameSaved2();
                break;
            case "C": // Restart the 3 saved game
                this.startGameSaved3();
                break;
            case "D": // Restart the 4 saved game
                this.startGameSaved4();
                break;
            case "E": // Restart the 5 saved game
                this.startGameSaved5();
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

    private void startGameSaved1() {
        System.out.println("\n*** startGameSaved1 function called ***");
    }

    private void startGameSaved2() {
        System.out.println("\n*** startGameSaved2 function called ***");
    }

    private void startGameSaved3() {
        System.out.println("\n*** startGameSaved3 function called ***");
    }

    private void startGameSaved4() {
        System.out.println("\n*** startGameSaved4 function called ***");
    }

    private void startGameSaved5() {
        System.out.println("\n*** startGameSaved5 function called ***");
    }

    private void mainMenuView() {
        System.out.println("\n*** mainMenuView function called ***");
    }
    
}
