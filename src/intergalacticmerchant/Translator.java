/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticmerchant;

import java.util.HashMap;

/**
 *
 * @author Puji
 */
public class Translator {
    private HashMap<String, String> Language = new HashMap<String, String>();
    private RomanConverter RC = new RomanConverter();
    private HashMap<String, Integer> RomanNumb = RC.getRomanMap();
    private boolean valid=true;
   
    public boolean LangInput(String Alien, String Roman){ //to add language into alien-roman number dictionary
        if(Language.containsKey(Alien)){     //if the alien number is already registered
            System.out.println("Sorry, that language is already taken");
            System.out.println("Here's the list:");
            Language.entrySet().forEach(map->{
                System.out.println(map.getKey() + " - " + map.getValue());  
            });
            valid=false;
        }
        else if (RomanNumb.containsKey(Roman)==false){
            System.out.println("That is not a roman number");
            valid=false;
        }
        else {
            Language.put(Alien, Roman); valid=true;} //add language to dictionary
            return valid;
    }
   
    public HashMap<String, String> getLangMap() { //to get dictionary hashmap
        return Language;
    }
}
