/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.InventoryItem;
import byui.cit260.screamsDisappeared.model.Zombie;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;
import screamsdisappeared.ScreamsDisappeared;
import screamsdisappeared.control.GameControl;

/**
 *
 * @author carriero
 */
public class GameMenuView extends View {

    private String menu;
    private String promptMessage;

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Game Menu                           |"
                + "\n------------------------------------------"
                + "\nM - Main Menu"
                + "\nC - Select your character"
                + "\nT - Start the game"
                + "\nD - Get description of the started game"
                + "\nH - Help Menu"
                + "\nV - View Map"
                + "\nI - View a list of inventory Items"
                + "\nZ - See the Closest Zombie"
                + "\nX - See the list of the Zombie dogs sort by race"
                + "\nS - Save game"
                + "\nQ - Exit Game"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "M": // Return to Main Menu
                this.mainMenuView();
                // Create MainMenuView object
                MainMenuView mainMenuView = new MainMenuView();

                // Display the main menu view
                mainMenuView.display();
                break;
            case "C": // Display Character
                this.startSelectCharacter();
                break;
            case "T": // Return Restart game menu view
                StartView startView = new StartView();
                startView.display();
                break;
            case "D": // Display Description of the Game
                this.startGetDescriptionGame();
                break;
            case "H": // Return to Help Menu
                this.helpMenuView();
                // Creat MainMenuView object
                HelpMenuView helpMenuView = new HelpMenuView();

                // Display the main menu view
                helpMenuView.display();
                break;
            case "V": // Display View Map
                this.startViewMap();
                break;
            case "I": // Display Inventory Items
                this.startInventoryItems();
                break;
            case "Z": // Display Inventory Items
                this.closestZombie();
                break;
            case "X":

                this.ZombieDogs();
                break;
            case "S": // Save the current Game
                this.startSaveGame();
                break;
            case "Q": // Exit the Game
                this.startExitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void mainMenuView() {
        System.out.println("\n*** DisplymainMenuView function called ***");
    }

    private void startSelectCharacter() {
        System.out.println("\n*** StartSelectCharacter function called ***");
    }

    private void restartGameMenuView() {
        System.out.println("\n*** DisplayGameMenuView function called ***");
    }

    private void startGetDescriptionGame() {
        System.out.println("\n*** startGetDescriptionGame function called ***");
    }

    private void helpMenuView() {
        System.out.println("\n*** DisplayHelpMenuView function called ***");
    }

    private void startViewMap() {
        StringBuilder line;

        Game game = ScreamsDisappeared.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();

        System.out.println("\n        Screams of the Disappeared");
        line = new StringBuilder("                                         ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());

        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                            ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            System.out.println(line.toString());
        }

    }

    private void startInventoryItems() {
        StringBuilder line;

        Game game = ScreamsDisappeared.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();

        System.out.println("\n        LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                         ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());

        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                            ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            System.out.println(line.toString());
        }
    }

    private void closestZombie() {
        StringBuilder line;

        Game game = ScreamsDisappeared.getCurrentGame();
        Point currentLocation = new Point(game.getMap().getCurrentRow(), game.getMap().getCurrentColumn());

        Zombie closestZombie = GameControl.getClosestZombie(currentLocation);

        System.out.println("The closest zombie is " + closestZombie.name()
                + ". Description is " + closestZombie.getDescription() + ". "
                + " Located at (" + closestZombie.getCoordinates().x + ", "
                + closestZombie.getCoordinates().y + ").");
        
        System.out.println("Here is the complete list of Zombies, their descriptions, and locations.");
        
        for (Zombie z : Zombie.values()) {
            line = new StringBuilder("                                                                                       ");
            line.insert(0, z.name());
            line.insert(15, z.getDescription());
            line.insert(53, "(" + z.getCoordinates().x + ", ");
            line.insert(56, z.getCoordinates().y+ ")");
            System.out.println(line.toString());
        }       
        
        doAction("M");
    }

    private void startSaveGame() {
        System.out.println("\n*** startSaveGame function called ***");
    }

    private void startExitGame() {
        System.out.println("\n*** startExitGame function called ***");
    }

    private void ZombieDogs() {
        System.out.println("\n*** ZombieDogs function called ***");
    }
}
