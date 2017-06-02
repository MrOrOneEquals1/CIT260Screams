/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;

import byui.cit260.screamsDisappeared.model.Player;
import screamsdisappeared.ScreamsDisappeared;

/**
 *
 * @author carriero
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        ScreamsDisappeared.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
    
}
