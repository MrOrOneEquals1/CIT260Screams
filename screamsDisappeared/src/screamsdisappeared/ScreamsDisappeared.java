/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.Player;
import citbyui.cit260.screamsDisappeared.view.StartProgramView;

/**
 *
 * @author Darin
 */
public class ScreamsDisappeared {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void setCurrentGame(Game currentGame) {
        ScreamsDisappeared.currentGame = currentGame;
    }

    public static void setPlayer(Player player) {
        ScreamsDisappeared.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static Player getPlayer() {
        return player;
    }
}

   
