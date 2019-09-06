/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author pokem
 */
public class SandwichFactory {
    public Sandwich createSandwich(String type){
        Sandwich sandwich = null;
        
        if (type.equalsIgnoreCase("Ham")){
            sandwich = new Ham();
        }
        else if (type.equalsIgnoreCase("MeatBall")){
            sandwich = new MeatBall();
        }
        else if (type.equalsIgnoreCase("RoastBeef")){
            sandwich = new RoastBeef();
        }
        else if (type.equalsIgnoreCase("Turkey")){
            sandwich = new Turkey();
        }
        return sandwich;
    }
}
