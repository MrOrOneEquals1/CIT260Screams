/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.InventoryItem;
import byui.cit260.screamsDisappeared.model.Weapons;
import byui.cit260.screamsDisappeared.model.Zombie;
import byui.cit260.screamsDisappeared.model.ZombieDogs;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import screamsdisappeared.ScreamsDisappeared;
import screamsdisappeared.control.GameControl;
import java.util.EnumSet;

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
                + "\nY - Calculation Menu"
                + "\nZ - Closest Zombie List"
                + "\nR - See the list of the Zombie dogs sort by lowet weight"
                + "\nW - See the Weapon Lowest price "
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
            case "Y":
                CalculationsMenuView calculationsMenuView = new CalculationsMenuView();

                calculationsMenuView.display();

                break;
            case "Z":
                ClosestZombieView closestZombieView = new ClosestZombieView();

                closestZombieView.display();
                doAction("Z");
                break;
            case "R":
                ZombieDogsView zombieDogsView = new ZombieDogsView();
                zombieDogsView.display();
                doAction("R");
                
                break;
            case "W":
                this.LowestPrice();
                break;
            case "Q": // Exit the Game
                this.startExitGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void mainMenuView() {
        this.console.println("\n*** DisplymainMenuView function called ***");
    }

    private void startSelectCharacter() {
        this.console.println("\n*** StartSelectCharacter function called ***");
    }

    private void restartGameMenuView() {
        this.console.println("\n*** DisplayGameMenuView function called ***");
    }

    private void startGetDescriptionGame() {
        this.console.println("\n*** startGetDescriptionGame function called ***");
    }

    private void helpMenuView() {
        this.console.println("\n*** DisplayHelpMenuView function called ***");
    }

    private void startViewMap() {
        StringBuilder line;

        Game game = ScreamsDisappeared.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();

        this.console.println("\n        Screams of the Disappeared");
        line = new StringBuilder("                                         ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        this.console.println(line.toString());

        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                            ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            this.console.println(line.toString());
        }

    }

    private void startInventoryItems() {
        StringBuilder line;

        Game game = ScreamsDisappeared.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();

        this.console.println("\n        LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                         ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        this.console.println(line.toString());

        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                            ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            this.console.println(line.toString());
        }
    }

    /*private void ZombieDogs() {
        StringBuilder line;
        Game game = ScreamsDisappeared.getCurrentGame();

        this.console.println("\n  LIST OF ZOMBIE DOGS");
        line = new StringBuilder("                                  ");
        line.insert(0, "BREED");
        line.insert(20, "WEIGHT IN KILOS");
        //line.insert(30, "LOCATION");
        this.console.println(line.toString());

        for (ZombieDogs zd : ZombieDogs.values()) {

            line = new StringBuilder("                               ");
            line.insert(0, zd.name());
            line.insert(20, zd.getWeight());
            //line.insert(30, "(" + zd.getCoordinates().x + ", ");
            // line.insert(35, zd.getCoordinates().y+ ")");
            this.console.println(line.toString());

        }

        for (ZombieDogs zd : EnumSet.range(ZombieDogs.Pug, ZombieDogs.Beagle)) {
            this.console.println("The lowest Weight is a " + zd.name()
                    + ".The Weight is " + zd.getWeight() + " Kilos");
        }

        doAction("R1");

    }*/

    private void LowestPrice() {
        StringBuilder line;
        Game game = ScreamsDisappeared.getCurrentGame();

        this.console.println("\n  LIST OF WEAPONS");
        line = new StringBuilder("                                         ");
        line.insert(0, "WEAPON");
        line.insert(20, "PRICE");
        line.insert(30, "LOCATION");
        this.console.println(line.toString());

        for (Weapons w : Weapons.values()) {

            line = new StringBuilder("                                                                                       ");
            line.insert(0, w.name());
            line.insert(20, w.getPrice());
            line.insert(30, "(" + w.getCoordinates().x + ", ");
            line.insert(35, w.getCoordinates().y + ")");
            this.console.println(line.toString());
            ;
        }

        doAction("Z1");

    }

    private void startExitGame() {
        this.console.println("\n*** startExitGame function called ***");
    }
}
