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
 * @author Darin
 */
public class MainMenuView extends View {

    private String menu;
    private String promptMessage;

    public MainMenuView() {
        super("\n"
                + "\n| Main Menu                        |"
                + "\n------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nR - Restart Saved game"
                + "\nM - Game Menu"
                + "\nQ - Quit"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        boolean rtnValue = true;

        switch (value) {
            case "N": // create and start a new game
                GameControl.createNewGame(ScreamsDisappeared.getPlayer());

                //display the game menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;
            case "G": // create and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                // Creat MainMenuView object
                HelpMenuView helpMenuView = new HelpMenuView();
                // Display the main menu view
                helpMenuView.display();
                break;
            case "S": // save the current game
                this.saveGame();
                //start a saved game
                break;

            case "R": //Menu to r
                RestartGameMenuView restartGameMenuView = new RestartGameMenuView();
                //Display the Restart Game Menu View
                restartGameMenuView.display();
                break;
            case "M": // display the game menu
                //If they haven't started a game yet, start one for them
                if (ScreamsDisappeared.getCurrentGame() == null) {
                    doAction("N");
                    break;
                }
                // Creat GameMenuView object
                GameMenuView gameMenuView = new GameMenuView();
                // Display the game menu view
                gameMenuView.display();
                break;
            case "D": // Display Description of Game
                this.startSceneDescription();
                break;
            case "K": // Display Description of Game
                this.startLeaveScene();
                break;
            case "P": // Display Description of Game
                this.startPickUpObject();
                break;
            case "U": // Display Description of Game
                this.startUseObject();
                break;
            case "L": // Display Description of Game
                this.locationMenuView();
                // Creat LocationMenuView object
                LocationMenuView locationMenuView = new LocationMenuView();

                // Display the location menu view
                locationMenuView.display();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try Again");
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
        gameMenu.display();
    }

    private void startExistingGame() {
        this.console.println("\nEnter the file path for the file where the game is saved.");

        String filepath = this.getInputNoMenu();

        try {
            GameControl.getSavedGame(filepath);

        } catch (Exception ex) {
            ErrorView.display("MainMenuVuew", ex.getMessage());
        }
        this.console.println("\nYour game has restarted");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        this.console.println("\n*** displayHelpMenu() function called ***");
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        String filepath = this.getInputNoMenu();

        try {
            GameControl.saveGame(ScreamsDisappeared.getCurrentGame(), filepath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        this.console.println("\nYour game has been saved.");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void DisplayRestartGameMenu() {
        this.console.println("\n*** RestartGameMenuView) function called ***");
    }

    private void displayGameMenuView() {
        this.console.println("\n*** RestartGameMenuView) function called ***");
    }

    private void tripNeededView() {
        this.console.println("\n*** tripNeededView) function called ***");
    }

    private void MoneyEarnedView() {
        this.console.println("\n*** MoneyEarnedView) function called ***");
    }

    private void ExplosivesNeededView() {
        this.console.println("\n*** explosivesNeededView) function called ***");
    }

    private void startSceneDescription() {
        this.console.println("\n*** startSceneDiscription) function called ***");
    }

    private void startLeaveScene() {
        this.console.println("\n*** startLeaveScene) function called ***");
    }

    private void startPickUpObject() {
        this.console.println("\n*** startPickUpObject function called ***");
    }

    private void startUseObject() {
        this.console.println("\n*** startUseObject function called ***");
    }

    private void locationMenuView() {
        this.console.println("\n*** locationMenuView function called ***");
    }
}
