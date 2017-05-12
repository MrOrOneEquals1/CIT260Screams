/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author David Vera
 */
public class QuestionScene implements Serializable {
    
    private String noToAnswer;
    private int bonus;

    public QuestionScene() {
    }
    
    
    public String getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(String noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.noToAnswer);
        hash = 79 * hash + this.bonus;
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionScene{" + "noToAnswer=" + noToAnswer + ", bonus=" + bonus + '}';
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
        final QuestionScene other = (QuestionScene) obj;
        if (this.bonus != other.bonus) {
            return false;
        }
        if (!Objects.equals(this.noToAnswer, other.noToAnswer)) {
            return false;
        }
        return true;
    }
    
     public static void main(String[] args){}
}
