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
public class RomanConverterTest {
    
    public RomanConverterTest() {
    }
    RomanConverter RomanIns = new RomanConverter();
    private HashMap<String, Integer> Roman = RomanIns.getRomanMap();
    /**
     * Test of RomanChecker method, of class RomanConverter.
     */
    @Test
    public void testRomanChecker() {
        System.out.println("=RomanChecker=");
        
        assertEquals(true, RomanIns.RomanChecker("XIV"));
        assertEquals(true, RomanIns.RomanChecker("MCDXCIV"));
        assertEquals(true, RomanIns.RomanChecker("MMMIII"));
        assertEquals(true, RomanIns.RomanChecker("MDCLXVI"));
        assertEquals(true, RomanIns.RomanChecker("XIV"));
        
        assertEquals(true, RomanIns.RomanChecker("XXX"));
        assertEquals(true, RomanIns.RomanChecker("III"));
        assertEquals(true, RomanIns.RomanChecker("CCC"));
        assertEquals(true, RomanIns.RomanChecker("MMM"));
        
        assertEquals(false, RomanIns.RomanChecker("IIII"));
        assertEquals(false, RomanIns.RomanChecker("XXXX"));
        assertEquals(false, RomanIns.RomanChecker("MMMM"));
        assertEquals(false, RomanIns.RomanChecker("CCCC"));
        
        assertEquals(false, RomanIns.RomanChecker("XIXX"));
        assertEquals(false, RomanIns.RomanChecker("IXIV"));
        assertEquals(false, RomanIns.RomanChecker("CXCC"));
        assertEquals(false, RomanIns.RomanChecker("MCMM"));
        assertEquals(false, RomanIns.RomanChecker("MMMCCCCXXX"));
        assertEquals(false, RomanIns.RomanChecker("MMMCCCXXXX"));
        assertEquals(false, RomanIns.RomanChecker("MMMMCCCXXX"));
        
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Convert method, of class RomanConverter.
     */
    @Test
    public void testConvert() {
        System.out.println("=Convert=");
        
        assertEquals(14, RomanIns.Convert("XIV"));
        assertEquals(3333, RomanIns.Convert("MMMCCCXXXIII"));
        assertEquals(3999, RomanIns.Convert("MMMCMXCIX"));
        assertEquals(3444, RomanIns.Convert("MMMCDXLIV"));
        assertEquals(3666, RomanIns.Convert("MMMDCLXVI"));
        assertEquals(2100, RomanIns.Convert("MMC"));
        assertEquals(1444, RomanIns.Convert("MCDXLIV"));
    }

    /**
     * Test of getRomanMap method, of class RomanConverter.
     */
    @Test
    public void testGetRomanMap() {
        System.out.println("=getRomanMap=");

        assertEquals(Roman.get("I"), 1, 0.0);
        assertEquals(Roman.get("X"), 10, 0.0);
        assertEquals(Roman.get("V"), 5, 0.0);
        assertEquals(Roman.get("L"), 50, 0.0);
        assertEquals(Roman.get("M"), 1000, 0.0);
        assertEquals(Roman.get("D"), 500, 0.0);
        assertEquals(Roman.get("C"), 100, 0.0);
    }
    
}
