
package citbyui.cit260.screamsDisappeared.view;
import java.util.Scanner;
import screamsdisappeared.control.ExplosivesNeeded;

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




public class ExplosivesNeededView {

    private String display="";

    void displayExplosivesNeededView() {
        System.out.println(display);
        displayZ();
    }

    public ExplosivesNeededView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n| ExplosivesNeeded                           |"
                + "\n------------------------------------------";
    }

    public void displayZ() {

        boolean done = false; // set flag to not done
        do {

            System.out.println("\n Do you want toknow how many explosives do you need to kill the zombies?? (Y/N)");
            Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
            String z = ""; //value to be returned 
            z = keyboard.nextLine();
            z = z.trim();
            if (!z.toUpperCase().equals("Y")) // user wants to proceed
            {
                return;
            } else {

            int lengthOfRoom = getLengthOfRoom();
            int widthOfRoom = getwidthOfRoom();
            int  heightOfRoom = getheightOfRoom();
            ExplosivesNeeded explosivesNeeded= new ExplosivesNeeded();

            double explosives=explosivesNeeded.calcExplosivesNeeded (lengthOfRoom,widthOfRoom, heightOfRoom);  

                System.out.println("\nYou need " + explosives + " explosives");
            }
            // do the requested action and display the next view
            HelpMenuView helpMenuView = new HelpMenuView();
            
            done = helpMenuView.doAction("L");

        } while (!done);

    }

    private int getLengthOfRoom() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int lengthOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n Please enter the length of the room");

            lengthOfRoom = keyboard.nextInt(); // get next line typed on keyboard
            if (lengthOfRoom < 8) {  //zombies killed is negative
                System.out.println("\nInvalid value: Length of the room can not be less than 8");
                return -1;
            }

            if (lengthOfRoom> 16) {  //zombies killed is more than 25
                System.out.println("\nInvalid value: Length of the room can not be more than 16");
                return -1;
            }
            break;  // end the loop
        }
        return lengthOfRoom; // return the value entered;

    }

    private int getwidthOfRoom() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int widthOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("Please enter the width of the room");

            widthOfRoom = keyboard.nextInt(); // get next line typed on keyboard

            if (widthOfRoom < 11) {  //zombieDogs killed is negative
                System.out.println("\nInvalid value: Length of the room can not be less than 11");
                return -1;
            }

            if (widthOfRoom > 15) {  //zombieDogs killed is more than 25
                System.out.println("\nInvalid value: value cannot be more than 25");
                return -1;
            }

        break;  // end the loop
        
        }
        
        return widthOfRoom; // return the value entered;

    }
private int getheightOfRoom() {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard

        boolean valid = false; // initialize to not valid
        int heightOfRoom = 0;
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n Please enter the height of the room");

            heightOfRoom = keyboard.nextInt(); // get next line typed on keyboard

            if (heightOfRoom< 15) {  //zombieDogs killed is negative
                System.out.println("\nInvalid value: Length of the room can not be less than 15");
                return -1;
            }

            if (heightOfRoom > 20) {  //zombieDogs killed is more than 25
                System.out.println("\nInvalid value: value cannot be more than 25");
                return -1;
            }

        break;  // end the loop
        
        }
        
        return heightOfRoom; // return the value entered;

    }

}


    
   // private String promptMessage;

    //public void displayExplosivesNeededView() {

       // boolean done = false; // set flag to not done
       // do {
         //   String lengthOfRoom = this.getLengthOfRoom();
          //  if (lengthOfRoom.toUpperCase().equals("Q")) // user wants to quit
           // {
           //     return; // exit the game
           // }
            // do the requested action and display the next view
            //done = this.doAction(lengthOfRoom);

       // } while (!done);

    //} 
    
   // private String getLengthOfRoom() {

        
       //Create an input file for the console
        // Scanner inFile;
       //inFile = new Scanner (System.in);
       // Get the value of the length of room
        //double lengthOfRoom= inFile.nextDouble() ;  
       // boolean valid = false; // initialize to not valid
        //promptMessage = "Please enter the lenght of the room.";

        //while (!valid) { // loop while an invalid value is enter
           // System.out.println("\n" + this.promptMessage);

         // Read the value of the next line typed in the console
      //String name= inFile.nextLine ();



           // if (lengthOfRoom < 8) { //  invalid value 
           //    System.out.println("\nInvalid value: LenghtOfRoom cannot be less than 8");
          // }
           // else if   (lengthOfRoom > 16) { 
           //   System.out.println("\nInvalid value: LenghtOfRoom cannot be more than 16");  
           //}   
            
           //  else
                //System.out.println( "You have entered "+ lengthOfRoom); 
            
    //}
        
        
    
   // private boolean doAction( String lengthOfRoom) {
      
    // if (lengthOfRoom.length() <2) {
        //    System.out.println("\nInvalid Players Name:  The name must be greater than one character in length");
           // return false;
      //  }
        
   
     // this.calcExplosivesNeeded (double lengthOfRoom,double widthOfRoom, double heightOfRoom);  
     
        
     //   return true; //success !
//}   
   //call createPlayer() control function
     //   Room room = GameControl.createRoom(lengthOfRoom);
        
        
      //  if (room == null) { // if unsuccessful
       //     System.out.println("\nError creating the player.");
      //      return false;
      //  }
        //display next view
      //  this.displayNextView(room);
        
      //  return true; //success !
//}

