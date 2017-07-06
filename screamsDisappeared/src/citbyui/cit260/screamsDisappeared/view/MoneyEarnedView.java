/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;
import screamsdisappeared.control.MoneyEarned;
import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import screamsdisappeared.ScreamsDisappeared;
/**
 *
 * @author carriero
 */
public class MoneyEarnedView  {

    private String display="";
    protected final BufferedReader keyboard = ScreamsDisappeared.getInFile();
    protected final PrintWriter console = ScreamsDisappeared.getOutFile();    

    void displayMoneyEarnedView() throws CalculationControlException {
        this.console.println(display);
        displayZombiesKilledYn();
    }

    public MoneyEarnedView() {
        this.display = "\n"
                + "\n------------------------------------------"
                + "\n| Money Earned                           |"
                + "\n------------------------------------------";
    }

    public void displayZombiesKilledYn() throws CalculationControlException{

        boolean done = false; // set flag to not done
        try {

            this.console.println("\n Do you want to get money for the Zombies and Zombiedogs? (Y/N)");
            String zombiesKilledYn = ""; //value to be returned 
            zombiesKilledYn = keyboard.readLine();
            zombiesKilledYn = zombiesKilledYn.trim();
            if (!zombiesKilledYn.toUpperCase().equals("Y")) // user wants to proceed
            {
                return;
            } else {

                int zombiesKilled = getZombiesKilled();

                int zombiesDogKilled = getZombiesDogKilled();

                MoneyEarned moneyEarned = new MoneyEarned();

                double dollars = moneyEarned.calcMoneyEarned(zombiesKilled, zombiesDogKilled);

                this.console.println("\nYou have earned " + dollars + " dollars");
            }
            // do the requested action and display the next view
            GameMenuView gmv = new GameMenuView();
            
            done = gmv.doAction("Y");

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }

    }

    private int getZombiesKilled() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        int zombiesKilled = 0;
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n How many Zombies did you kill?");
try{
           
           String zombiesKilledstring = (keyboard.next()); // get next line typed on keyboard                
                
                zombiesKilled = parseInt(zombiesKilledstring);
                
            if (zombiesKilled < 0 || zombiesKilled >25) {  //zombies killed is negative
                
                 throw new CalculationControlException("The value has to be between 0 and 25.");
            }
           
                valid = true;
                
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"\nYou must enter a valid number.");
            }
            
        }
        this.console.println("\n Good job! You have entered the right value.");
        return zombiesKilled; // return the value entered;
    }
    
  private int getZombiesDogKilled() throws CalculationControlException {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        int zombiesDogKilled= 0;
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n How many Zombies Dog did you kill?");
try{
          
           String zombiesDogKilledstring = (keyboard.next()); // get next line typed on keyboard                
                
                zombiesDogKilled= parseInt(zombiesDogKilledstring);
                
            if (zombiesDogKilled < 0 || zombiesDogKilled >25) {  
                
                 throw new CalculationControlException("The value has to be between 0 and 25.");
            }

              
                valid = true;
                
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"\nYou must enter a valid number.");
            }
            
        }
        this.console.println("\n Good job! You have entered the right value.");
        return zombiesDogKilled; // return the value entered;
   
  }

}
