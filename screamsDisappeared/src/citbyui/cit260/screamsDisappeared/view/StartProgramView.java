/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import screamsdisappeared.control.GameControl;
import byui.cit260.screamsDisappeared.model.Player;
import java.util.Scanner;

/**
 *
 * @author carriero
 */
public class StartProgramView extends View{
    
    private String promptMessage;
    
    public StartProgramView() {
        
        promptMessage = "\nWhat is the name of the player trying to escape?";
        //display the banner when view is created
        displayBanner();
        this.console.println(promptMessage);
    }

    private void displayBanner() {
        
        this.console.println(
                "\n**************************************************"
                +"\n Welcome to Screams of the Disappeared!"
                +"\nYou will be asked to solve puzzles and attempt to "
                +"\nescape the city.  As you progress through your journey"
                +"\nyou will be be able to earn money to buy the things"
                +"\nnecessary for you to leave successfully."
                +"\n"
                +"\nBeware!  Wrong decisions can lead to certain death."
                +""
                +""
                +""
                +""
                
        );
    }


@Override
    public boolean doAction(String playersName) {
        
        if (playersName.length() <2) {
            ErrorView.display(this.getClass().getName(),"\nInvalid Players Name:  The name must be greater than one character in length");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        
        if (player == null) { // if unsuccessful
            ErrorView.display(this.getClass().getName(),"\nError creating the player.");
            return false;
        }
        //display next view

        this.displayNextView(player);

        return true; //success !
}

    private void displayNextView(Player player) {

        // display a custom welcome message
        
        this.console.println("\n==============================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n=============================="
                                  );
                          
       // Creat MainMenuView object
       MainMenuView mainMenuView = new MainMenuView();
               
       // Display the main menu view
       mainMenuView.display();
    }



    
}
