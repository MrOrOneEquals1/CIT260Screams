/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.io.PrintWriter;
import screamsdisappeared.ScreamsDisappeared;

/**
 *
 * @author carriero
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = ScreamsDisappeared.getOutFile();
    private static final PrintWriter logFile = ScreamsDisappeared.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                  "------------------------------------------------"
                + "\n- ERROR -" + errorMessage
                + "\n----------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
