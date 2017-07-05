/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.Zombie;
import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;
import java.awt.Point;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import java.util.Scanner;
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

            case "S": // Return to Help Menu
                this.saveList();
                break;

            case "D":
                this.closestZombie();
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

    private void closestZombie() {
        StringBuilder line;

        Game game = ScreamsDisappeared.getCurrentGame();
        Point currentLocation = new Point(game.getMap().getCurrentRow(), game.getMap().getCurrentColumn());

        Zombie closestZombie = GameControl.getClosestZombie(currentLocation);

        this.console.println("The closest zombie is " + closestZombie.name()
                + ". Description is " + closestZombie.getDescription() + ". "
                + " Located at (" + closestZombie.getCoordinates().x + ", "
                + closestZombie.getCoordinates().y + ").");

        this.console.println("Here is the complete list of Zombies, their descriptions, and locations.");

        for (Zombie z : Zombie.values()) {
            line = new StringBuilder("                                                                                       ");
            line.insert(0, z.name());
            line.insert(15, z.getDescription());
            line.insert(53, "(" + z.getCoordinates().x + ", ");
            line.insert(56, z.getCoordinates().y + ")");
            this.console.println(line.toString());

        }

    }

    public void saveList() throws CalculationControlException {
        String fileLocation = this.fileLocation();
        StringBuilder line;

        try (FileWriter outFile = new FileWriter(fileLocation)) {

            Game game = ScreamsDisappeared.getCurrentGame();
            Point currentLocation = new Point(game.getMap().getCurrentRow(), game.getMap().getCurrentColumn());

            Zombie closestZombie = GameControl.getClosestZombie(currentLocation);

            outFile.write("The closest zombie is " + closestZombie.name()
                    + ". Description is " + closestZombie.getDescription() + ". "
                    + " Located at (" + closestZombie.getCoordinates().x + ", "
                    + closestZombie.getCoordinates().y + ").");

            outFile.write(String.format("%n%nHere is the complete list of Zombies, their descriptions, and locations."));
            outFile.write(String.format("%n%n            Zombie List "));
            outFile.write(String.format("%n%-15s%-37s%15s", "Name", "Description", "Location"));
            outFile.write(String.format("%n%-15s%-37s%15s", "----", "-----------", "--------"));

            for (Zombie z : Zombie.values()) {
                //line = new StringBuilder("                                                                                       ");
                outFile.write(String.format("%n%-15s%-37s%15s", z.name(), z.getDescription(), "(" + z.getCoordinates().x + "," + z.getCoordinates().y + ")"));
//                line.insert(15, z.getDescription());
//                line.insert(53, "(" + z.getCoordinates().x + ", ");
//                line.insert(56, z.getCoordinates().y + ")");
//                outFile.write(line.toString());
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),"Error saving Players names to file");
        }
        this.console.println("The list has been saved to " + fileLocation);

    }

    private String fileLocation() {


        boolean valid = false; // initialize to not valid
        String fileLocation = null;
        
        try {
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n What is the name of the file you want to save?");

                fileLocation = (this.keyboard.readLine()); // get next line typed on keyboard                
                
                if (fileLocation.length() < 1) {
                    ErrorView.display(this.getClass().getName(),"\nYou must enter a valid name.");
                    valid = false;
                }

                valid = true;

            }
        
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }return fileLocation;
    }
        
}
