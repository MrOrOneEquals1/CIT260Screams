/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;

/**
 *
 * @author Darin
 */
public class HelpMenuView extends View {

    private String menu;
    private String promptMessage;

    public HelpMenuView() {
        super ("\n"
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
                + "\nN - Explosives Needed"
                + "\n---------------------------------------");
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
            case "L": 
                LocationMenuView locationMenuView = new LocationMenuView();
                locationMenuView.display();
                break;
             case "G": // Display Game Menu
                this.gameMenuView();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
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
                mainMenuView.display();
                break;
             case "N": // Return to MainMenu
                this.explosivesNeededView();
                // Creat MainMenuView object
                ExplosivesNeededView explosivesNeededView = new ExplosivesNeededView();
                explosivesNeededView.displayExplosivesNeededView();
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

    private void explosivesNeededView() {
        System.out.println("\n*** Explosives Needed function called ***");
        
    }




}
