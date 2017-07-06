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
public class MoveCharacterView extends View{
    
    
    void displayMenu() {
       this.console.println("\n*** displayMenu stub function called ***");
   }
    private String menu;
    private String promptMessage;
    private String display="";
    
    public MoveCharacterView() {
         super("\n"
                + "\n------------------------------------------"
                + "\n| Move Character Menu                     |"
                + "\n------------------------------------------"
                + "\nM - Move to the next location"
                + "\nP - Return to previous location"
                + "\nO - Get out of the car"
                + "\nI - Get in to the car"
                + "\nR - Get out of the room"
                + "\nT - Get in to the room"
                + "\nB - Return to previous menu"
                + "\nQ - Exit game"
                + "\n------------------------------------------");
  }

    @Override
   public boolean doAction(String choice) {
        
   choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "M": // Move to the next location
                this.moveNextLocation();
                break;
            case "P": // Return to previous location
                this.returnPreviousLocation();
                break;
            case "O": // Get out of the car
                this.outOfCar();
                break;
            case "I": // Get in to the car
                this.inToCar();
                break;
            case "R": // Get out of the room
                this.outOfRoom();
                break;
             case "T": // Get in to the room
                this.intToRoom();
                break; 
             case "B": // Return to previous menu              
                this.locationMenuView();
                // Creat LocationMenuView object
                LocationMenuView locationMenuView = new LocationMenuView();

                // Display the location menu view
                locationMenuView.display();
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

    private void moveNextLocation() {
        this.console.println("\n*** moveNextLocation function called");
    }

    private void returnPreviousLocation() {
        this.console.println("\n*** returnPreviousLocation function called");
    }

    private void outOfCar() {
        this.console.println("\n*** outOfCar function called");
    }

    private void inToCar() {
        this.console.println("\n*** inToCar function called");
    }

    private void outOfRoom() {
        this.console.println("\n*** outOfRoom function called");
    }

    private void intToRoom() {
        this.console.println("\n*** inToRoom function called");
    }

    private void returnPreviousMenu() {
        this.console.println("\n*** returnPreviousMenu function called");
    }

    private void startExitGame() {
        this.console.println("\n*** startExitGame function called");
    }

    private void locationMenuView() {
         this.console.println("\n*** locationMenuView function called");
    }

    
    
}
