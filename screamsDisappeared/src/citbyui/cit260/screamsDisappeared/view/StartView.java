/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

/**
 *
 * @author Darin
 */
public class StartView extends View {

   // private String promptMessage;


    public StartView() {

        super (
                Description.getDescription()
                + "\n"
                + "\nYou see an inviting house just off the road.  The porch"
                + "\nlight is on.  It seems like a good place to get information."
                + "\n"
                + "\n*****Options******"
                + "\n"
                + "\nH - Go talk to the House"
                + "\nC - Go to the City Center"
                + "\n"
            
        );
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "H": // Go to the House with the Lights
                this.HomeLightOn(); 
                break;
            case "L": // Display Description of Game
                this.CityCenter();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void HomeLightOn() {
        System.out.println("*** HomeLightOn called ***");
    }

    private void CityCenter() {
        System.out.println("*** CityCenter called ***");
    }

    
    }


