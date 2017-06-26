/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.Player;
import byui.cit260.screamsDisappeared.model.ZombieDogs;
import citbyui.cit260.screamsDisappeared.view.StartProgramView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        startProgramView.display();
        
        ZombieDogs Z1 = new ZombieDogs("Pug", "Small", "10 Kilos");
        ZombieDogs Z2 = new ZombieDogs("Beagle", "Medium", "15 Kilos");
        ZombieDogs Z3 = new ZombieDogs("Rottweiler", "Big", "30 Kilos");
        ZombieDogs Z4 = new ZombieDogs("Bulldog", "Big", "35 Kilos");
        ZombieDogs Z5 = new ZombieDogs("Doberman", "Big", "40 Kilos");
        
        List<ZombieDogs> zombieDogs = new ArrayList<>();
        
        zombieDogs.add(Z1);
        zombieDogs.add(Z2);
        zombieDogs.add(Z3);
        zombieDogs.add(Z4);
        zombieDogs.add(Z5);
        
        Collections.sort(zombieDogs);
        
        System.out.println("Race     \tSize     \tWeight");
        for (ZombieDogs element: zombieDogs){
            
            System.out.println(element);
        }
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

   
