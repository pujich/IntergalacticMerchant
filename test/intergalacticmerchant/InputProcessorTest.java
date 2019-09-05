/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticmerchant;

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
public class InputProcessorTest {
    
    public InputProcessorTest() {
    }
    InputProcessor instance = new InputProcessor();
    /**
     * Test of ProcessInput method, of class InputProcessor.
     */
    @Test
    public void testProcessInput() {
        System.out.println("ProcessInput");
        
        assertEquals("", instance.ReadInput("glob is I"));
        assertEquals("", instance.ReadInput("prok is V"));
        assertEquals("", instance.ReadInput("pish is X"));
        assertEquals("", instance.ReadInput("tegj is L"));
        assertEquals("", instance.ReadInput("gob is S")); //this will print "that is not a roman number" as it is not a roman number
        assertEquals("", instance.ReadInput("glob is C")); // this will print that the language is already taken and print the list. the language will not registered
        
        assertEquals("pish tegj glob glob is 42", instance.ReadInput("how much is pish tegj glob glob ?"));
        assertEquals("pish tegj is 40", instance.ReadInput("how much is pish tegj error ?")); //ignoring the unrecognizable language
        assertEquals("I have no idea what you are talking about", instance.ReadInput("how much is pish tegj error")); // incorrect template
        assertEquals("I have no idea what you are talking about", instance.ReadInput("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?"));
        
        assertEquals("", instance.ReadInput("glob glob Silver is 34 Credits"));
        assertEquals("", instance.ReadInput("glob prok Gold is 57800 Credits"));
        assertEquals("", instance.ReadInput("pish pish Iron is 3910 Credits"));
        assertEquals("", instance.ReadInput("pish pish Iron is 3910 Credits"));
        
        assertEquals("glob prok Gold is 57800 Credits", instance.ReadInput("how many Credits is glob prok Gold ?"));
        assertEquals("Sorry, we don't sell that", instance.ReadInput("how many Credits is glob prok Platinum ?")); //if the material is not registered
        assertEquals("Sorry, your language input is incorrect", instance.ReadInput("how many Credits is glob prok pish Gold ?")); //invalid roman
        assertEquals("Sorry, your language input is incorrect", instance.ReadInput("how many Credits is glob prok glob Silver ?")); //if the material is not registered
        assertEquals("Sorry, your language input is incorrect", instance.ReadInput("how much is glob prok pish ?")); //invalid roman
    }
    
}
