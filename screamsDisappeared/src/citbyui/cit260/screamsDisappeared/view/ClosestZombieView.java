/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.Zombie;
import java.awt.Point;
import screamsdisappeared.ScreamsDisappeared;
import screamsdisappeared.control.GameControl;

/**
 *
 * @author carriero
 */
public class ClosestZombieView extends View {
    
    private String menu;
    private String promptMessage;

    public ClosestZombieView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Closest Zombie List                    |"
                + "\n------------------------------------------"
                + "\nD - Display the List"
                + "\nS - Save the List"
                + "\nG - Game Menu"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "G": // Return to Main Menu
                this.mainMenuView();
                // Create MainMenuView object
                GameMenuView gameMenuView = new GameMenuView();

                // Display the main menu view
                gameMenuView.display();
                break;

//            case "S": // Return to Help Menu
//                this.saveList();
//                break;

            case "D":
                this.closestZombie();
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
            line.insert(56, z.getCoordinates().y + ")");
            System.out.println(line.toString());
            
        }       
        
    }
    
}
