/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared;

import byui.cit260.screamsDisappeared.model.Actor;
import byui.cit260.screamsDisappeared.model.Player;

/**
 *
 * @author Darin
 */
public class ScreamsDisappeared {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Hugo Vera");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
     Actor actorOne= new Actor();   
        
       actorOne.setName(" DLH");
       actorOne.setDescription("Description about DLH"); 
       actorOne.setCoordinates("east, west, south.."); 
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
           
        
    }
    
}
