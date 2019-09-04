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
    
    /**
     * Test of UpdatePrice method, of class Pricing.
     */
    @Test
    public void testUpdatePrice() {
        System.out.println("UpdatePrice");
        String Goods = "Silver";
        Double Price = 1000.0;
        Pricing instance = new Pricing();
        boolean expResult = true;
        boolean result = instance.UpdatePrice(Goods, Price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGoodsPriceMap method, of class Pricing.
     */
    @Test
    public void testGetGoodsPriceMap() {
        System.out.println("getGoodsPriceMap");
        Pricing instance = new Pricing();
        HashMap<String, Double> expResult = null;
        HashMap<String, Double> result = instance.getGoodsPriceMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CountCredits method, of class Pricing.
     */
    @Test
    public void testCountCredits() {
        System.out.println("CountCredits");
        String Goods = "Silver";
        int Qty = 6;
        Pricing instance = new Pricing();
        double expResult = 0.0;
        double result = instance.CountCredits(Goods, Qty);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CountPrice method, of class Pricing.
     */
    @Test
    public void testCountPrice() {
        System.out.println("CountPrice");
        String Credits = "2000";
        int Qty =5;
        Pricing instance = new Pricing();
        double expResult = 500.0;
        double result = instance.CountPrice(Credits, Qty);
        assertEquals(expResult, result, 500.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
