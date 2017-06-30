/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import screamsdisappeared.control.TripNeeded;

/**
 *
 * @author David Vera
 */
public class TripNeededView extends View{
     private String display="";
     

    void displayTripNeededView() {
        System.out.println(display);
        display();
    }

    public TripNeededView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Trips to the gas station you need                           |"
                + "\n------------------------------------------");
    }

    public void displaytripNeededView() throws CalculationControlException{

        boolean done = false; // set flag to not done
        do {

            System.out.println("\n Do you want to get gas for the car? (Y/N)");
            Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
            String tripNeededView = ""; //value to be returned 
            tripNeededView = keyboard.nextLine();
            tripNeededView = tripNeededView.trim();
            if (!tripNeededView.toUpperCase().equals("Y")) // user wants to proceed
            {
                return;
            } else {

                int gallonsNeeded = gallonsNeeded();

                int bottlePerTrip = bottlePerTrip();
                
                //int litersNeeded = litersNeeded();

                TripNeeded tripNeeded = new TripNeeded();

                double trips = tripNeeded.calcTripNeeded(gallonsNeeded, bottlePerTrip);

                System.out.println("\nYou have to make " + trips + " trips");
            }
            // do the requested action and display the next view
            GameMenuView gmv = new GameMenuView();
            
            done = gmv.doAction("Y");

        } while (!done);

    }

    public int gallonsNeeded() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int gallonsNeeded = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n Enter the number of gallons");
            String lengthstring = (keyboard.next());
        try {            
             // get next line typed on keyboard                

            gallonsNeeded = parseInt(lengthstring);
            }catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");
            }
                
            //gallonsNeeded = keyboard.nextInt(); // get next line typed on keyboard
            if (gallonsNeeded < 0 || gallonsNeeded > 15 ) {  //the numbers of gallos are out of range
                
                throw new CalculationControlException ("Invalid value: value cannot be out of range 1-15");
                }            
             
                    valid = true;  // end the loop
        }return gallonsNeeded; // return the value entered;    
        
        
    }   
        

    

     public int bottlePerTrip() throws CalculationControlException{

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int bottlePerTrip = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n How many bottles do you have?");
            String lengthstring = (keyboard.next()); // get next line typed on keyboard                
            try {               

                bottlePerTrip = parseInt(lengthstring);
                }
            catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");
            } 
                //bottlePerTrip = keyboard.nextInt(); // get next line typed on keyboard
            if (bottlePerTrip < 0 || bottlePerTrip > 2) {  //numbers of the botles are out of range
                
                throw new CalculationControlException("Invalid value: value cannot be out of range 1-2.");
                
                }
            
                valid = true;  // end the loop
        
                    

        }return bottlePerTrip;  

     }        
            

   
    /*public int litersNeeded() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int litersNeeded = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\nEnter the numbers of liters needed, multiply gallons by 3");
            String lengthstring = (keyboard.next()); // get next line typed on keyboard                
            try {
                litersNeeded = parseInt(lengthstring);
                //litersNeeded = keyboard.nextInt();
             // get next line typed on keyboard
                }catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");       

            }
            if (litersNeeded < 0 || litersNeeded > 56) {  //numbers of the liters is out of range
                
                throw new CalculationControlException("Invalid value: value cannot be out of the range 1-56");
                /*System.out.println("\nInvalid value: value cannot be out of the range 1-56");
                continue;*/
                //}            
             
            //valid = true;  // end the loop
       // }return  litersNeeded; // return the value entered;
     //}*/
}        
            
        
   
