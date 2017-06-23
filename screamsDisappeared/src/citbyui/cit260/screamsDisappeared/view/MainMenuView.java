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
                break;
            case "R": //Menu to restart a saved game
                this.DisplayRestartGameMenu();
                // Creat RestartGameMenuView object
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
            case "C": // Display the option to enter information to calculate
                this.tripNeededView();
                // Creat GallonsNeededView object
                TripNeededView tripNeededView = new TripNeededView();

                //Display the gallons needed view
                tripNeededView.displayTripNeededView();
                break;
            case "E": // Display the option to enter information to calculate
                this.MoneyEarnedView();

                MoneyEarnedView moneyEarnedView = new MoneyEarnedView();

                moneyEarnedView.displayMoneyEarnedView();
                break;

            case "X": // Display the option to enter information to calculate
                this.ExplosivesNeededView();

                ExplosivesNeededView explosivesNeededView = new ExplosivesNeededView();

                explosivesNeededView.displayExplosivesNeededView();
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
        gameMenu.display();
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

    private void displayGameMenuView() {
        System.out.println("\n*** RestartGameMenuView) function called ***");
    }

    private void tripNeededView() {
        System.out.println("\n*** tripNeededView) function called ***");
    }

    private void MoneyEarnedView() {
        System.out.println("\n*** MoneyEarnedView) function called ***");
    }

    private void ExplosivesNeededView() {
        System.out.println("\n*** explosivesNeededView) function called ***");
    }

    private void startSceneDescription() {
        System.out.println("\n*** startSceneDiscription) function called ***");
    }

    private void startLeaveScene() {
        System.out.println("\n*** startLeaveScene) function called ***");
    }

    private void startPickUpObject() {
        System.out.println("\n*** startPickUpObject function called ***");
    }

    private void startUseObject() {
        System.out.println("\n*** startUseObject function called ***");
    }

    private void locationMenuView() {
        System.out.println("\n*** locationMenuView function called ***");
    }
}
