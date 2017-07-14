/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;

/**
 *
 * @author David Vera
 */
public class LocationWithWeaponView extends View{
    
    public LocationWithWeaponView() {
               super("\n"
                + "\n------------------------------------------"
                + "\n| Choose the weapon on this room          |"
                + "\n------------------------------------------"
                + "\nM - Machete"
                + "\nG - Gun"
                + "\nE - Explosives"
                + "\n------------------------------------------");
            
    }
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "M": // Pick the Machete
                this.Machete();
                break;

            case "G": // Pick the Gun
                
                this.Gun();
                break;
            case "E":// Pick Explosives
                this.explosivesNeedeView();
                
                ExplosivesNeededView explosivesNeededView = new ExplosivesNeededView();
                try {explosivesNeededView.displayExplosives();
                }catch (CalculationControlException me) {
                    ErrorView.display(this.getClass().getName(),me.getMessage());
                    doAction("E");
                }
                break;

            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void Machete() {
        this.console.println("This will allow you to kill 2 zombies in a room");
    }

    private void Gun() {
        this.console.println("You can kill 3 zombies in a room with a gun.");
    }

    

    private void explosivesNeedeView() {
        this.console.println("***explosivesNeededView function called");
    }
   
    
}
