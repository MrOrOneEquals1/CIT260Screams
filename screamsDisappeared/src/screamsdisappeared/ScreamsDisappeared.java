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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darin
 */
public class ScreamsDisappeared {

    public static PrintWriter logFile = null;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            ScreamsDisappeared.inFile = new BufferedReader(new InputStreamReader(System.in));
            ScreamsDisappeared.outFile = new PrintWriter(System.out, true);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            
            String filePath = "log.txt";
            ScreamsDisappeared.logFile = new PrintWriter(filePath);
            
            return;

           
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();

        } finally {
            try {
                if (ScreamsDisappeared.inFile != null) {
                    ScreamsDisappeared.inFile.close();
                }

                if (ScreamsDisappeared.outFile != null) {
                    ScreamsDisappeared.outFile.close();
                }
                
                if (ScreamsDisappeared.logFile !=null) {
                    ScreamsDisappeared.logFile.close();
                }
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }
    }

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

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

    public static PrintWriter getOutFile() {
        return outFile;
       
    }
    
    public static PrintWriter getLogFile() {
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile) {
        ScreamsDisappeared.logFile = logFile;
    }

    public static BufferedReader getInFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static BufferedReader getInFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
