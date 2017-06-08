




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package citbyui.cit260.screamsDisappeared.view;

///import java.util.Scanner;

//import screamsdisappeared.control.GameControl;
//import byui.cit260.screamsDisappeared.model.Player;
/**
 *
 * @author lauravaleriogibbs
 */

package citbyui.cit260.screamsDisappeared.view;
import java.util.Scanner;
import screamsdisappeared.control.ExplosivesNeeded;



public class ExplosivesNeededView {

    private String display="";

    void displayExplosivesNeededView() {
        System.out.println(display);
        displayExplosives();
    }

    public ExplosivesNeededView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n|       Explosives Needed                   |"
                + "\n------------------------------------------";
    }

    public void displayExplosives() {

        boolean done = false; // set flag to not done
        do {

            System.out.println("\n Do you want to know how many explosives do you need to kill the zombies?? (Y/N)");
            Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
            String explosives = ""; //value to be returned 
            explosives = keyboard.nextLine();
            explosives = explosives.trim();
            if (!explosives.toUpperCase().equals("Y")) // user wants to proceed
                
            {
                System.out.println("\n We are sad.You have chosen not to know how many explosives you need"); 
                       
                return;
            } else System.out.println("\n Thank you for your intersting in the game");
            {

            int lengthOfRoom = getLengthOfRoom();
            int widthOfRoom = getwidthOfRoom();
            int  heightOfRoom = getheightOfRoom();
            ExplosivesNeeded explosivesNeeded= new ExplosivesNeeded();

            double totalExplosives=explosivesNeeded.calcExplosivesNeeded (lengthOfRoom,widthOfRoom, heightOfRoom);  

                System.out.println("\n Wow You just need " + totalExplosives + " explosives");
            }
            // do the requested action and display the next view
            HelpMenuView helpMenuView = new HelpMenuView();
            
            done = helpMenuView.doAction("L");

        } while (!done);

    }

    private int getLengthOfRoom() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int lengthOfRoom=0 ;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n Please enter the length of the room");

            lengthOfRoom = keyboard.nextInt(); // get next line typed on keyboard
            if (lengthOfRoom < 8 || lengthOfRoom> 16 ) {  // Lenght of the room has to be between 8 and 16
                System.out.println("\nInvalid value: Lenght of the room has to be between 8 and 16");
                continue;
                
            }

            break;  // end the loop
        }
        System.out.println("\n Good job! You have entered the right value.");
        return lengthOfRoom; // return the value entered;
      
    }

    private int getwidthOfRoom() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int widthOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("Please enter the width of the room");

            widthOfRoom = keyboard.nextInt(); // get next line typed on keyboard
if (widthOfRoom < 11 || widthOfRoom> 15 ) {  //Width of the room has to be between 11 and 15
                System.out.println("\nInvalid value: Width of the room has to be between 11 and 15");
                continue;
                
            }

            break;  // end the loop
        }
        System.out.println("\n Good job! You have entered the right value.");
        return widthOfRoom; // return the value entered;
      
    }

            
private int getheightOfRoom() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int heightOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n Please enter the height of the room");

            heightOfRoom = keyboard.nextInt(); // get next line typed on keyboard

            if (heightOfRoom < 15 || heightOfRoom> 20 ) {  //Height of the room has to be between 15 and 20
                System.out.println("\nInvalid value: Height of the room has to be between 15 and 20");
                continue;
                
            }

            break;  // end the loop
        }
        System.out.println("\n Good job! You have entered the right value");
        return heightOfRoom; // return the value entered;
      
    }

}


    
   
