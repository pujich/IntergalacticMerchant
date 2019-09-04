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
public class RomanConverterTest {
    
    public RomanConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RomanChecker method, of class RomanConverter.
     */
    @Test
    public void testRomanChecker() {
        System.out.println("RomanChecker");
        String roman = "";
        RomanConverter instance = new RomanConverter();
        boolean expResult = false;
        boolean result = instance.RomanChecker(roman);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Convert method, of class RomanConverter.
     */
    @Test
    public void testConvert() {
        System.out.println("Convert");
        String roman = "";
        RomanConverter instance = new RomanConverter();
        int expResult = 0;
        int result = instance.Convert(roman);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRomanMap method, of class RomanConverter.
     */
    @Test
    public void testGetRomanMap() {
        System.out.println("getRomanMap");
        RomanConverter instance = new RomanConverter();
        HashMap<String, Integer> expResult = null;
        HashMap<String, Integer> result = instance.getRomanMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
