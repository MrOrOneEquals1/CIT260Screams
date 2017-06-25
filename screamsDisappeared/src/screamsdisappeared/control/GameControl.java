/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;

import byui.cit260.screamsDisappeared.model.Car;
import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.InventoryItem;
import byui.cit260.screamsDisappeared.model.Location;
import byui.cit260.screamsDisappeared.model.Map;
import byui.cit260.screamsDisappeared.model.Player;
import byui.cit260.screamsDisappeared.model.Scene;
import byui.cit260.screamsDisappeared.model.Weapons;
import byui.cit260.screamsDisappeared.model.Zombie;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import screamsdisappeared.ScreamsDisappeared;
import screamsdisappeared.control.MapControl.SceneType;

/**
 *
 * @author
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

        Game game = new Game(); //create a new game
        ScreamsDisappeared.setCurrentGame(game); //save in ScreamsDisappeared

        game.setPlayer(player);  //save player in the game

        //create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Car car = new Car();
        game.setCar(car);

        Map map = MapControl.createMap();
        game.setMap(map);

        MapControl.moveActorsToStarttingLocation(map);

    }

    public static InventoryItem[] createInventoryList() {

        //create arraly(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[Item.values().length];

        InventoryItem knife = new InventoryItem();
        knife.setDescription("Knife");
        knife.setQuantityInStock(0);
        knife.setRequiredAmount(0);
        inventory[Item.knife.ordinal()] = knife;

        InventoryItem gas = new InventoryItem();
        gas.setDescription("Gas");
        gas.setQuantityInStock(0);
        gas.setRequiredAmount(0);
        inventory[Item.gas.ordinal()] = gas;

        InventoryItem explosives = new InventoryItem();
        explosives.setDescription("Explosives");
        explosives.setQuantityInStock(0);
        explosives.setRequiredAmount(0);
        inventory[Item.explosives.ordinal()] = explosives;

        InventoryItem money = new InventoryItem();
        money.setDescription("Money");
        money.setQuantityInStock(0);
        money.setRequiredAmount(0);
        inventory[Item.money.ordinal()] = money;

        InventoryItem gasContainer = new InventoryItem();
        gasContainer.setDescription("Gas Container");
        gasContainer.setQuantityInStock(0);
        gasContainer.setRequiredAmount(0);
        inventory[Item.gasContainer.ordinal()] = gasContainer;

        InventoryItem gun = new InventoryItem();
        gun.setDescription("Gun");
        gun.setQuantityInStock(0);
        gun.setRequiredAmount(0);
        inventory[Item.gun.ordinal()] = gun;

        return inventory;

    }

    public static Zombie getClosestZombie(Point currentLocation) {

        Zombie closestZombie = null;
        int previousDistance=100;
        
        for (Zombie z : Zombie.values()) {
            int distance = Math.abs(currentLocation.x - z.getCoordinates().x) + Math.abs(currentLocation.y - z.getCoordinates().y);
            
            if (distance < previousDistance){
                closestZombie = z;  
            
            previousDistance = distance;          
            } 
        }
               
        return closestZombie;

    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.house.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.car.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.city.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.zombieRoom.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.gasStation.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.finishScene.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.startingScene.ordinal()]);
    }
    public static Weapons getLowestPrice(int[]weapons) {
    int minValue = weapons[0];

for (int index = 0;index< weapons.length ;index++){

if ( weapons[index] < minValue){

    int lowestPrice = weapons[index];

}

}
        Weapons lowestPrice = null;

return lowestPrice;
        }
    public enum Item {
        knife,
        gas,
        explosives,
        money,
        gasContainer,
        gun;

    }

}
