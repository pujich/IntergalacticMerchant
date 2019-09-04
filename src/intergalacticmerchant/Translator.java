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
   public HashMap<String, String> Language = new HashMap<String, String>();
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
       else {Language.put(Alien, Roman); valid=true;} //add language to dictionary
       return valid;
   }
   
   public HashMap<String, String> getLangMap() { //to get dictionary hashmap
         return Language;
    }
}
