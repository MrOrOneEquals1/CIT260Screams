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
public class GameMenuView extends View {

    private String menu;
    private String promptMessage;
    
    public GameMenuView() {
        super ("\n"
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
                + "\nS - Save game"
                + "\nQ - Exit Game"
                + "\n------------------------------------------");
    }


    private void mainMenuView() {
        System.out.println("\n*** DisplymainMenuView function called ***");
    }

    private void startSelectCharacter() {
        System.out.println("\n*** StartSelectCharacter function called ***");
    }

    private void restartGameMenuView () {
        System.out.println("\n*** DisplayGameMenuView function called ***");
    }

    private void startGetDescriptionGame() {
        System.out.println("\n*** startGetDescriptionGame function called ***");
    }

    private void helpMenuView() {
        System.out.println("\n*** DisplayHelpMenuView function called ***");
    }

    private void startViewMap() {
        System.out.println("\n*** startViewMap function called ***");
    }

     private void startInventoryItems() {
      System.out.println("\n*** startInventoryItems function called ***");
    }
 private void startSaveGame() {
        System.out.println("\n*** startSaveGame function called ***");
    }

  private void startExitGame() {
        System.out.println("\n*** startExitGame function called ***");
    }  

    @Override
    public boolean doAction(String value) {
           System.out.println("\n*** doAction function called ***");
        return true;
    }
}
