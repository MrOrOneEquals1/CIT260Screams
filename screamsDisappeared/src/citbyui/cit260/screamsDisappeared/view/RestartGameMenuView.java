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
public class RestartGameMenuView extends View{
    
    private String menu;
    private String promptMessage;

    public RestartGameMenuView() {
        super ("\n"
                + "\n---------------------------------------"
                + "\n| Please select from the following saved games:   |"
                + "\n---------------------------------------"
                + "\nA "
                + "\nB "
                + "\nC "
                + "\nD "
                + "\nE "
                + "\nM - Return to the Main Menu"
                + "\n---------------------------------------");
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
                mainMenuView.display();
                break;
             
            default:
                this.console.println("\n*** “If you don’t see your game listed here, then return to the Main Menu and start a new game");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void startGameSavedA() {
        this.console.println("\n*** startGameSaved1 function called ***");
    }

    private void startGameSavedB() {
        this.console.println("\n*** startGameSaved2 function called ***");
    }

    private void startGameSavedC() {
        this.console.println("\n*** startGameSaved3 function called ***");
    }

    private void startGameSavedD() {
        this.console.println("\n*** startGameSaved4 function called ***");
    }

    private void startGameSavedE() {
        this.console.println("\n*** startGameSaved5 function called ***");
    }

    private void mainMenuView() {
        this.console.println("\n*** mainMenuView function called ***");
    }
    
}
