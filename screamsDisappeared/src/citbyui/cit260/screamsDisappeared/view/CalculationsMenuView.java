/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;

/**
 *
 * @author carriero
 */
public class CalculationsMenuView extends View{

    private String menu;
    private String promptMessage;

    public CalculationsMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Calculations Menu                           |"
                + "\n------------------------------------------"
                + "\nG - Gallons Needed"
                + "\nT - Trips Needed"
                + "\nE - Earn Money"
                + "\nX - Explosives Needed"
                + "\nM - Game Menu"
                + "\n------------------------------------------");
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "G":
                this.GallonsNeededView();

                GallonsNeededView gallonsNeededView = new GallonsNeededView();

                gallonsNeededView.display();
                break;
            case "T": // Display the option to enter information to calculate

                TripNeededView tripNeededView = new TripNeededView();

                tripNeededView.displayTripNeededView();
                break;
            case "E": // Display the option to enter information to calculate

                MoneyEarnedView moneyEarnedView = new MoneyEarnedView();

                moneyEarnedView.displayMoneyEarnedView();
                break;

            case "X": // Display the option to enter information to calculate

                ExplosivesNeededView explosivesNeededView = new ExplosivesNeededView();
                try {
                    explosivesNeededView.displayExplosivesNeededView();
                } catch (CalculationControlException me) {
                    System.out.println(me.getMessage());
                    doAction("X");
                }

                break;
            case "M": // Display Game Menu

                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void GallonsNeededView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
