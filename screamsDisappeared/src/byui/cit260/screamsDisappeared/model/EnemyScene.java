/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;

import java.io.Serializable;

/**
 *
 * @author David Vera
 */
public class EnemyScene implements Serializable {
    
    private int roomSize;
    private int zombiesQuantity;

    public EnemyScene() {
    }
       
   
    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    public int getZombiesQuantity() {
        return zombiesQuantity;
    }

    public void setZombiesQuantity(int zombiesQuantity) {
        this.zombiesQuantity = zombiesQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.roomSize;
        hash = 17 * hash + this.zombiesQuantity;
        return hash;
    }

    @Override
    public String toString() {
        return "EnemyScene{" + "roomSize=" + roomSize + ", zombiesQuantity=" + zombiesQuantity + '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EnemyScene other = (EnemyScene) obj;
        if (this.roomSize != other.roomSize) {
            return false;
        }
        if (this.zombiesQuantity != other.zombiesQuantity) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args){}
    
    
}
