/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;



import java.io.BufferedReader;
import java.io.PrintWriter;
import screamsdisappeared.ScreamsDisappeared;

/**
 *
 * @author carriero
 */
public interface ViewInterface {
    
    static final BufferedReader keyboard = ScreamsDisappeared.getInFile();
    static final PrintWriter console = ScreamsDisappeared.getOutFile();
    public void display();
    public String getInput();
    public boolean doAction(String value);

}
