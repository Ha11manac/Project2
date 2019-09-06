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
public class SandwichStore {
    SandwichFactory factory;
    
    public SandwichStore(SandwichFactory factory){
        this.factory = factory;
    }
    
    public Sandwich orderSandwich(String type){
        Sandwich sandwich;
        
        sandwich = factory.createSandwich(type);
        
        System.out.println("Making "+ sandwich.getSName());
        
        return sandwich;
    }
    
}
