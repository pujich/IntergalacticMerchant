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
public class TranslatorTest {
    
    public TranslatorTest() {
    }
    Translator Translator = new Translator();
    HashMap<String, String> Words = Translator.getLangMap();
    /**
     * Test of LangInput method, of class Translator.
     */
    @Test
    public void testLangInput() {
        System.out.println("=LangInput=");
        
        assertEquals(true, Translator.LangInput("glob", "I"));
        assertEquals(Words.get("glob"), "I");
        assertEquals(Words.containsKey("glob"), true);
        assertEquals(false, Translator.LangInput("glob", "V"));
        assertEquals(false, Translator.LangInput("pok", "S"));
        assertEquals(Words.containsKey("false"), false);
   
    }

    /**
     * Test of getLangMap method, of class Translator.
     */
    @Test
    public void testGetLangMap() {
        System.out.println("=getLangMap=");       
        HashMap<String, String> result = Translator.getLangMap();
        
        Translator.LangInput("glob", "I");
        Translator.LangInput("prok", "V");
 
        assertEquals(true, result.containsKey("glob"));
        assertEquals(true, result.containsKey("prok"));
        assertEquals(true, result.containsValue("I"));
        assertEquals(true, result.containsValue("V"));
        assertEquals(false, result.containsKey("pesh"));
        assertEquals(false, result.containsValue("X"));

    }
    
}
