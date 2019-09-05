/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticmerchant;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
    public HashMap<String, Double> Price = Pricing.getGoodsPriceMap();
    /**
     * Test of UpdatePrice method, of class Pricing.
     */
    @Test
    public void testUpdatePrice() {
        System.out.println("UpdatePrice");
        String Goods = "Silver";
        Double Price = 1000.0;
        
        boolean expResult = true;
        boolean result = Pricing.UpdatePrice(Goods, Price);
        assertEquals(expResult, result);
      
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
        String Goods = "Silver";
        int Qty = 6;
        double expResult = 0.0;
        double result = Pricing.CountCredits(Goods, Qty);
        assertEquals(expResult, result, 0.0);
     
    }

    /**
     * Test of CountPrice method, of class Pricing.
     */
    @Test
    public void testCountPrice() {
        System.out.println("CountPrice");
        String Credits = "2000";
        int Qty =5;
        double expResult = 400.0;
        double result = Pricing.CountPrice(Credits, Qty);
        assertEquals(expResult, result, 0.0);
   
    }
    
}
