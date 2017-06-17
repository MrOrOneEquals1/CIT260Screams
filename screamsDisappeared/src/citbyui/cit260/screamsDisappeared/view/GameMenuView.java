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

//    void displayMenu() {
//       System.out.println("\n*** displayMenu stub function called ***");
//   }
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
// public void displayGameMenuView() {
//
//        boolean done = false; // set flag to not done
//        do {
//            // prompt for and get players name
//            String menuOption = this.getMenuOption();
//            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
//            {
//                return; // exit the game
//            }
//            // do the requested action and display the next view
//            done = this.doAction(menuOption);
//
//        } while (!done);
//
//    }

//    private String getMenuOption() {
//        System.out.println(menu);
//
//        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
//        String value = ""; //value to be returned
//        boolean valid = false; // initialize to not valid
//        promptMessage = "Please make your selection from the menu above.";
//        while (!valid) { // loop while an invalid value is enter
//            System.out.println("\n" + this.promptMessage);
//
//            value = keyboard.nextLine(); // get next line typed on keyboard
//            value = value.trim(); // trim off leading and trailing blanks
//
//            if (value.length() < 1) { // value is blank
//                System.out.println("\nInvalid value: value cannot be blank");
//                continue;
//            }
//
//            break;  // end the loop
//
//        }
//
//        return value; // return the value entered
//    }

//    private boolean doAction(String choice) {
//        
//   choice = choice.toUpperCase();
//
//        boolean rtnValue = true;
//
//        switch (choice) {
//            case "M": // Return to Main Menu
//                this.mainMenuView();
//                // Create MainMenuView object
//                MainMenuView mainMenuView = new MainMenuView();
//
//                // Display the main menu view
//                mainMenuView.display();
//                break;
//            case "C": // Display Character
//                this.startSelectCharacter();
//                break;
//            case "T": // Return Restart game menu view
//                this.restartGameMenuView();
//                // create Restart Game Menu View object
//                RestartGameMenuView restartGameMenuView= new RestartGameMenuView ();
//                // Display restart Game Menu View
//                restartGameMenuView.displayRestartGameMenuView ();
//                break;
//            case "D": // Display Description of the Game
//                this.startGetDescriptionGame();
//                break;
//            case "H": // Return to Help Menu
//                this.helpMenuView();
//                // Creat MainMenuView object
//                HelpMenuView helpMenuView = new HelpMenuView();
//
//                // Display the main menu view
//                helpMenuView.displayHelpMenuView();
//                break;
//             case "V": // Display View Map
//                this.startViewMap();
//                break; 
//             case "I": // Display Inventory Items
//                this.startInventoryItems();
//                break; 
//             case "S": // Save the current Game
//                this.startSaveGame();
//                break;
//             case "Q": // Exit the Game
//                this.startExitGame();
//                break;
//            default:
//                System.out.println("\n*** Invalid selection *** Try Again");
//                rtnValue = false;
//                break;
//
//        }
//
//        return rtnValue;
//    }

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
