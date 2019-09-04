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
public class TranslatorTest {
    
    public TranslatorTest() {
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
     * Test of LangInput method, of class Translator.
     */
    @Test
    public void testLangInput() {
        System.out.println("LangInput");
        String Alien = "";
        String Roman = "";
        Translator instance = new Translator();
        boolean expResult = false;
        boolean result = instance.LangInput(Alien, Roman);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLangMap method, of class Translator.
     */
    @Test
    public void testGetLangMap() {
        System.out.println("getLangMap");
        Translator instance = new Translator();
        HashMap<String, String> expResult = null;
        HashMap<String, String> result = instance.getLangMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
