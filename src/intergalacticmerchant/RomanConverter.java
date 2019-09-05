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
public class RomanConverter {
   
    public HashMap<String, Integer> RomanNumeral = new HashMap<String, Integer>() { //roman-arabic numbers list
	{
		put("I", 1);
                put("V", 5);
		put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
	}};
    private String [] splittedRoman;
    private boolean valid=true;    

    public boolean RomanChecker(String roman){ //to check validity of roman number
        String Roman = roman.toUpperCase();
        try{
            valid=Roman.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"); //checking the validity with matches method
        }
        catch (Exception e){
            System.out.println("Exception Occured in RomanChecker.");
            System.out.println(e);
        }
        return valid;
    }
  
    public int Convert(String roman) { //to convert roman into arabic number
        int result = 0;
        String Roman = roman.toUpperCase(); 
        splittedRoman = Roman.split("");
        try{
            for (int i = 0; i < Roman.length()-1; i++) {
                if (RomanNumeral.get(splittedRoman[i]) < RomanNumeral.get(splittedRoman[i+1])) { //if there's substraction like IX
                    result -= RomanNumeral.get(splittedRoman[i]);
                } else {
                    result += RomanNumeral.get(splittedRoman[i]);  //add if not a substraction case
                }
            }
            result += RomanNumeral.get(splittedRoman[Roman.length() - 1]); //adding the last roman number
        } catch (Exception e){
            System.out.println("Exception Occured in Convert.");
        }
        return result;
    }

    public HashMap<String, Integer> getRomanMap() { //to transfer roman hashmap
        return RomanNumeral;
    }
  
}
