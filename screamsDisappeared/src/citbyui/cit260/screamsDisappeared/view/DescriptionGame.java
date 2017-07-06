/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

/**
 *
 * @author carriero
 */
public class DescriptionGame extends View{
    
    public DescriptionGame() {
            
    
           super (
                Description.getDescription()
                + "\n"
                + "\n*****Options******"
                + "\n"
                + "\nH - Go talk to the House"
                + "\nC - Go to the City Center"
                + "\n"
            
        );
    }
    
    @Override
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void HomeLightOn() {
        this.console.println("*** HomeLightOn called ***");
    }

    private void CityCenter() {
        this.console.println("*** CityCenter called ***");
    }

    
}

