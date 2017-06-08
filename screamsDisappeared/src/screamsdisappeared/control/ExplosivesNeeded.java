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
    
    double lengthOfRoom=0;
    double widthOfRoom=0;
    double heightOfRoom=0;
    
  public double calcExplosivesNeeded (double lengthOfRoom,double widthOfRoom, double heightOfRoom){

      if (lengthOfRoom < 8 || lengthOfRoom>16){ 
          return -1;
}


      if ( widthOfRoom < 11 ||  widthOfRoom > 15){ 
          return -1;
  }

      if(heightOfRoom < 15 || heightOfRoom >20 ){
          return -1;
}

double cubicYardsOfVolume = lengthOfRoom * widthOfRoom* heightOfRoom/27;//Cubic feet to cubic yards
double explosivesNeeded = (Math.round (cubicYardsOfVolume) /10);//1 explosive per every 10 cubic yards
return explosivesNeeded  ; 

    }
}

