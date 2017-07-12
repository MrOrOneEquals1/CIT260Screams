/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared;

import byui.cit260.screamsDisappeared.model.Game;
import byui.cit260.screamsDisappeared.model.Player;
import byui.cit260.screamsDisappeared.model.ZombieDogs;
import citbyui.cit260.screamsDisappeared.view.ErrorView;
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
            String filePath = "log.txt";
            ScreamsDisappeared.logFile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

            return;

        } catch (Exception e) {

            ErrorView.display("ScreamsDisappeared", "Exception: " + e.toString()
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

                if (ScreamsDisappeared.logFile != null) {
                    ScreamsDisappeared.logFile.close();
                }

            } catch (IOException ex) {
                ErrorView.display("ScreamsDisappeared", "Error closing files");
                return;
            }

        }
    }

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

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

    public static BufferedReader getInFile() {
        return inFile;
    }

}
