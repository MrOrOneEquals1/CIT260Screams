/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared;

import byui.cit260.screamsDisappeared.model.Actor;
import byui.cit260.screamsDisappeared.model.Car;
import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.InventoryItem;
import byui.cit260.screamsDisappeared.model.Location;
import byui.cit260.screamsDisappeared.model.Map;
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
        
        Game gameOne = new Game();
        
            gameOne.setNoPeople(2);
            gameOne.setTotalTime(114);
        
            String gameInfo = gameOne.toString();
            System.out.println(gameInfo);
            
        Map mapOne = new Map();
        
            mapOne.setDescription("This is a descripton of the map");
            mapOne.setRowCount(5);
            mapOne.setColumnCount(5);
            mapOne.setCurrentRow(2);
            mapOne.setCurrentColumn(3);
                  
            String mapInfo = mapOne.toString();
            System.out.println(mapInfo);
         
        Location locationOne = new Location();
        
            locationOne.setRow(1);
            locationOne.setColumn(1);
            locationOne.setVisited(false);
            locationOne.setAmountRemaining(24.0);
                             
            String locationInfo = locationOne.toString();
            System.out.println(locationInfo);  
            
     Actor actorOne= new Actor();   
        
       actorOne.setName(" DLH");
       actorOne.setDescription("Description about DLH"); 
       actorOne.setCoordinates("east, west, south.."); 
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
     InventoryItem wallet   = new InventoryItem();    
     InventoryItem weapons  = new InventoryItem();    
     InventoryItem backpack = new InventoryItem(); 
    
     wallet.setInventoryType ("Money");
     wallet.setQuantityInStock(30);
     wallet.setRequiredAmount (50);
     
     String inventoryItemInfo = wallet.toString();
        System.out.println(inventoryItemInfo);
     
     weapons.setInventoryType ("Tools");
     weapons.setQuantityInStock(50);
     weapons.setRequiredAmount (20);
     String inventoryItemInfo2 = weapons.toString();
        System.out.println(inventoryItemInfo2);
     
        
     backpack.setInventoryType ("Resources");
     backpack.setQuantityInStock(1);
     backpack.setRequiredAmount (1);
     
     String inventoryItemInfo3 = backpack.toString();
        System.out.println(inventoryItemInfo3);
     
        
   Car carOne= new Car();     
        
    carOne.setDrivenMiles(500);
    carOne.setTankSize(14);
   String carInfo = carOne.toString();
        System.out.println(carInfo);     
        
    }
    
}
