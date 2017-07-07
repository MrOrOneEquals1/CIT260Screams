/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.Zombie;
import byui.cit260.screamsDisappeared.model.ZombieDogs;
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
 * @author David Vera
 */
public class ZombieDogsView extends View{
   
    private String menu;
    private String promptMessage;

    public ZombieDogsView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Zombie Dogs List                    |"
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
                try {
                    this.saveList();
                } catch (CalculationControlException me) {
                    ErrorView.display(this.getClass().getName(), me.getMessage());
                }
                break;
            case "D":
                this.zombieDogs();
                break;

            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void mainMenuView() {
        this.console.println("\n*** DisplymainMenuView function called ***");
    }

    private void zombieDogs() {
        StringBuilder line;

        Game game = ScreamsDisappeared.getCurrentGame();
        Point currentLocation = new Point(game.getMap().getCurrentRow(), game.getMap().getCurrentColumn());

        ZombieDogs zombieDogs = GameControl.getZombieDogs(currentLocation);

        

        this.console.println("Here is the list of Dogs, and their weight in Kilos.");

        for (ZombieDogs z : ZombieDogs.values()) {
            line = new StringBuilder("                                                                                       ");
            line.insert(0, z.name());
            line.insert(15, z.getWeight());
           
            this.console.println(line.toString());

        }

    }

    public void saveList() throws CalculationControlException {
        String fileLocation = this.fileLocation();
        StringBuilder line;

        try (FileWriter outFile = new FileWriter(fileLocation)) {

            Game game = ScreamsDisappeared.getCurrentGame();
            Point currentLocation = new Point(game.getMap().getCurrentRow(), game.getMap().getCurrentColumn());

            ZombieDogs zombieDogs = GameControl.getZombieDogs(currentLocation);

            outFile.write(String.format("%n%nHere is the list of Zombie Dogs, and their weight."));
            outFile.write(String.format("%n%n            Zombie Dog List "));
            outFile.write(String.format("%n%-15s%-37s%15s", "Race", "Weight", ""));
            outFile.write(String.format("%n%-15s%-37s%15s", "----------", "-----------", "------"));
            
            for (ZombieDogs z : ZombieDogs.values()) {
                outFile.write(String.format("%n%-15s%-37s%15s", z.name(), z.getWeight(), ")"));
            }            
            outFile.flush();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error saving Players names to file");
        }
        this.console.println("\nThe list has been saved to " + fileLocation);

    }

    private String fileLocation() {

        boolean valid = false; // initialize to not valid
        String fileLocation = null;

        try {
            while (!valid) { // loop while an invalid value is enter
                this.console.println("\n What is the name of the file you want to save?");

                fileLocation = (this.keyboard.readLine()); // get next line typed on keyboard                

                if (fileLocation == null || fileLocation.length() < 1 ) {
                    ErrorView.display(this.getClass().getName(), "\nYou must enter a valid name.");
                    valid = false;
                } else {
                    valid = true;
                }
            }

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return fileLocation;
    }

    
}
