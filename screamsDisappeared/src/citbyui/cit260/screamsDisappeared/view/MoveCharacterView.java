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
       System.out.println("\n*** displayMenu stub function called ***");
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
                + "\nB - Return to previoud menu"
                + "\nQ - Exit game"
                + "\n------------------------------------------");
  }
 /*public void displayMoveCharacterView() {

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
        promptMessage = "Please choose the action that you want to do.";
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
    }*/
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
             case "B": // Return to previoud menu
                this.returnPreviousMenu();
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

    private void moveNextLocation() {
        System.out.println("\n*** moveNextLocation function called");
    }

    private void returnPreviousLocation() {
        System.out.println("\n*** returnPreviousLocation function called");
    }

    private void outOfCar() {
        System.out.println("\n*** outOfCar function called");
    }

    private void inToCar() {
        System.out.println("\n*** inToCar function called");
    }

    private void outOfRoom() {
        System.out.println("\n*** outOfRoom function called");
    }

    private void intToRoom() {
        System.out.println("\n*** inToRoom function called");
    }

    private void returnPreviousMenu() {
        System.out.println("\n*** returnPreviousMenu function called");
    }

    private void startExitGame() {
        System.out.println("\n*** startExitGame function called");
    }

    
}
