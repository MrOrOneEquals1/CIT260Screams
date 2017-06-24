/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;

/**
 *
 * @author David Vera
 */
public class ZombieDogs  implements Comparable<ZombieDogs>{
    
    private String race, size, weight;

    public ZombieDogs(String race, String size, String weight) {
        this.race = race;
        this.size = size;
        this.weight = weight;
       
    }
    

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  race + ".    \t"+ size +".    \t"+  weight +"\n";
    }

    @Override
    public int compareTo(ZombieDogs o) {
        return race.compareTo(o.getRace());
    }
    
    
}
