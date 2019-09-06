/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticmerchant;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Puji
 */
public class PricingTest {
    
    public PricingTest() {
    }
    Pricing Pricing = new Pricing();
    HashMap<String, Double> Price = Pricing.getGoodsPriceMap();
    /**
     * Test of UpdatePrice method, of class Pricing.
     */
    @Test
    public void testUpdatePrice() {
        System.out.println("UpdatePrice");
        
        assertEquals(true, Pricing.UpdatePrice("Silver", 1000.0)); 
        assertEquals(false, Pricing.UpdatePrice("Platinum", 1000.0)); 
        assertEquals(true, Pricing.UpdatePrice("Gold", 5000.0));
        assertEquals(true, Pricing.UpdatePrice("Iron", 500.0));
        assertEquals(1000.0, Price.get("Silver"), 0.0);
        assertEquals(5000.0, Price.get("Gold"), 0.0);
        assertEquals(500.0, Price.get("Iron"), 0.0);
      
    }

    /**
     * Test of getGoodsPriceMap method, of class Pricing.
     */
    @Test
    public void testGetGoodsPriceMap() {
        System.out.println("getGoodsPriceMap");
        
        Pricing.UpdatePrice("Silver", 10.0);
        Pricing.UpdatePrice("Gold", 1000.0);
        
        assertEquals(true, Price.containsKey("Silver"));
        assertEquals(true, Price.containsValue(10.0));
        assertEquals(true, Price.containsKey("Gold"));
        assertEquals(true, Price.containsValue(1000.0));
        assertEquals(10.0, Price.get("Silver"), 0.0);
        assertEquals(1000.0, Price.get("Gold"), 0.0);

    }

    /**
     * Test of CountCredits method, of class Pricing.
     */
    @Test
    public void testCountCredits() {
        System.out.println("CountCredits");
        Pricing.UpdatePrice("Silver", 1000.0);
        Pricing.UpdatePrice("Gold", 2500.0);
        Pricing.UpdatePrice("Iron", 500.0);
        assertEquals(6000.0, Pricing.CountCredits("Silver", 6), 0.0);
        assertEquals(12500.0, Pricing.CountCredits("Gold", 5), 0.0);
        assertEquals(5000.0, Pricing.CountCredits("Iron", 10), 0.0);
    }

    /**
     * Test of CountPrice method, of class Pricing.
     */
    @Test
    public void testCountPrice() {
        System.out.println("CountPrice");

        assertEquals(400.0, Pricing.CountPrice("2000", 5), 0.0);
        assertEquals(1000.0, Pricing.CountPrice("5000", 5), 0.0);
        assertEquals(2000.0, Pricing.CountPrice("10000", 5), 0.0);
    }
    
}
