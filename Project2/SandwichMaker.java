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
public class SandwichMaker {
    public static void main(String[] args){
        SandwichFactory f = new SandwichFactory();
        SandwichStore store = new SandwichStore(f);
        
        Sandwich s = store.orderSandwich("Turkey");
        System.out.println("Customer ordered a " + s.getSName());
        System.out.println("Cost: $" + s.cost()+ "\n");
        
        s = store.orderSandwich("Ham");
        System.out.println("Customer ordered a " + s.getSName());
        System.out.println("Cost: $" + s.cost()+ "\n");
    }
}
