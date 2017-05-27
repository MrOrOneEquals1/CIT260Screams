/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;

/**
 *
 * @author lauravaleriogibbs
 */
public class ExplosivesNeeded {
    
  public double calcExplosivesNeeded (double lengthOfRoom,double widthOfRoom, double heightOfRoom){

      if (lengthOfRoom < 8 || lengthOfRoom>16){ 
          return -1;
}


      if ( widthOfRoom < 15 ||  widthOfRoom > 17){ 
          return -1;
  }

      if(heightOfRoom < 15 || heightOfRoom >20 ){
          return -1;
}

double cubicYardsOfVolume = (lengthOfRoom * widthOfRoom* heightOfRoom)/27;

double explosivesNeeded = cubicYardsOfVolume / 10 ; 

      return explosivesNeeded;
    
    
}
}

