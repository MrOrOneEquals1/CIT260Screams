/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;

import byui.cit260.screamsDisappeared.model.Map;
import citbyui.cit260.screamsDisappeared.view.StartView;
import javafx.scene.Scene;

/**
 *
 * @author David Vera
 */
public class MapControl {
    
    static Map createMap() {
        //create the map
        Map map = new Map(20, 20);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to location        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    
    }

    

    private static Scene[] createScenes() {
        
       Scene[] scenes = new Scene[SceneType.values().length];
       
       Scene startingScene = new Scene();
       startingScene.setDescription(
                      "Welcome to this exiting game");
       startingScene.setMapSymbol(" ST ");
       startingScene.setBlocked(false);
       scenes[SceneType.startingScene.ordinal()] = startingScene;
               
                     
        Scene gasStation = new Scene();
       gasStation.setDescription(
                      "You need to comeback several times, to get the enough"
                       + "gas to fill the tank of the car, and also bring money"
                       +"because it is not free");
       gasStation.setMapSymbol(" GS ");
       gasStation.setBlocked(false);
       scenes[SceneType.gasStation.ordinal()] = gasStation;
       
        Scene zombieRoom = new Scene();
       zombieRoom.setDescription(
                      "You have to kill enough zombies to collect money and "
                       + "you can buy gas for the car and scape of this problem");
       zombieRoom.setMapSymbol(" ZR ");
       zombieRoom.setBlocked(false);
       scenes[SceneType.zombieRoom.ordinal()] = zombieRoom;
       
       Scene house = new Scene();
       house.setDescription(
                      "According to the size of the room or any place of the house "
                       + "you can use the correct explosive, becareful and you kill your self jajaja");
       house.setMapSymbol(" H ");
       house.setBlocked(false);
       scenes[SceneType.house.ordinal()] = house;
       
       Scene car = new Scene();
       car.setDescription(
                      "You have to fill the tank of the car and go out of this horrible place ");
       car.setMapSymbol(" C ");
       car.setBlocked(false);
       scenes[SceneType.car.ordinal()] = car;
       
       
       Scene city = new Scene();
       city.setDescription(
                      "Welcome to this horrible city, where you have to run to scape of dead");
       city.setMapSymbol(" CI ");
       city.setBlocked(false);
       scenes[SceneType.city.ordinal()] = city;
       
       Scene finishScene = new Scene();
       finishScene.setDescription(
                      "Congratulations, you finish the game");
       finishScene.setMapSymbol(" FN ");
       finishScene.setBlocked(false);
       scenes[SceneType.finishScene.ordinal()] = finishScene;
       
        return scenes;
    }

    static void moveActorsToStarttingLocation(Map map) {
        System.out.println("\n*** moveActorstoStartLocation function called ***");
    }
    public enum SceneType {
        startingScene,
        gasStation,
        zombieRoom,
        house,
        car,
        city,
        finishScene;
           
    
    }
    
}
