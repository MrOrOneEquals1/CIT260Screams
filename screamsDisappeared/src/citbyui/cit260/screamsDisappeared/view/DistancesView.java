/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.DistanceLocations;
import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;
import java.awt.Point;
import java.io.FileWriter;
import java.io.IOException;
import screamsdisappeared.ScreamsDisappeared;
import screamsdisappeared.control.GameControl;

/**
 *
 * @author lauravaleriogibbs
 */
public class DistancesView extends View {

   

    public DistancesView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n|  Places List                    |"
                + "\n------------------------------------------"
                + "\nD - Display Places List"
                + "\nS - Save Places List"
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
                this.distances();
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

    private void distances() {
        
       StringBuilder line;
        Game game = ScreamsDisappeared.getCurrentGame();
        Point currentLocation = new Point(game.getMap().getCurrentRow(), game.getMap().getCurrentColumn());

        DistanceLocations distances = GameControl.getDistances(currentLocation);
        
       
        
 System.out.println("\n  LIST OF PLACES AND DISTANCES");
        line = new StringBuilder("                                         ");
        line.insert(0, "PLACE");
        line.insert(29, "DISTANCE");
        line.insert(50, "LOCATION");
        System.out.println(line.toString());
        

        //this.console.println("List of Weapons, thei price and location.");

        for (DistanceLocations z : DistanceLocations.values()) {
            line = new StringBuilder("                                                                                       ");
            line.insert(0, z.name());
            line.insert(28, z.getDistance());
            line.insert(33, "Miles");
            line.insert(50, "(" + z.getCoordinates().x + ", ");
            line.insert(53, z.getCoordinates().y + ")");
            this.console.println(line.toString());
            
            


        }
this.console.println("\nThe closest place is a " + distances.name()
                + "\nThe distance is  " + distances.getDistance() + " miles. "
                + "\nIt is Located at (" + distances.getCoordinates().x + ", "
                + distances.getCoordinates().y + ").");

    }

    public void saveList() throws CalculationControlException {
        String fileLocation = this.fileLocation();
        StringBuilder line;

        try (FileWriter outFile = new FileWriter(fileLocation)) {

            Game game = ScreamsDisappeared.getCurrentGame();
            Point currentLocation = new Point(game.getMap().getCurrentRow(), game.getMap().getCurrentColumn());

             DistanceLocations distances = GameControl.getDistances(currentLocation);

            outFile.write("Place " + distances.name()
                    + ". Distsnce " + distances.getDistance() + ". "
                    + " Located at (" + distances.getCoordinates().x + ", "
                    + distances.getCoordinates().y + ").");

           // outFile.write(String.format("%n%n List of Weapons, thei price and location."));
           // outFile.write(String.format("%n%n            Weapons List "));
            //outFile.write(String.format("%n%-15s%-37s%15s", "Name", "Price", "Location"));
            //outFile.write(String.format("%n%-15s%-37s%15s", "--------------------", "-----------", "--------"));
            
            for (DistanceLocations z : DistanceLocations.values()) {
                outFile.write(String.format( z.name(), z.getDistance(), "(" + z.getCoordinates().x + "," + z.getCoordinates().y + ")"));
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

