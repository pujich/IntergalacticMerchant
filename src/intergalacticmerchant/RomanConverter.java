/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticmerchant;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author Puji
 */
public class RomanConverter {
   
public HashMap<String, Integer> RomanNumeral = new HashMap<String, Integer>() {
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


public boolean RomanChecker(String roman){
    String Roman = roman.toUpperCase();
    splittedRoman = Roman.split("");
    int counter=0;
   
    System.out.println(Roman.length());
    for (int i = Roman.length()-1;i >= 0; i--){
        System.out.println("==================================");
        
       if(RomanNumeral.containsKey(splittedRoman[i])){ 
           System.out.println("masukcontains");
        if (i-1<0){
//            System.out.println(RomanNumeral.get(splittedRoman[i])+" "+RomanNumeral.get(splittedRoman[i+1]));
//            
//            if(RomanNumeral.get(splittedRoman[i])>RomanNumeral.get(splittedRoman[i+1])){System.out.println("success");break;}
//            
//            else if(splittedRoman[i].equals("I")||splittedRoman[i].equals("X")||splittedRoman[i].equals("C")||splittedRoman[i].equals("M")){
            
//            if(i<Roman.length()-2)
//                {System.out.println("masuk -2");
//                    if(RomanNumeral.get(splittedRoman[i])<RomanNumeral.get(splittedRoman[i+2])){System.out.println("rekt"); valid=false; break;}
//                else if(i<Roman.length()-3){ System.out.println("masuk -3 | "+RomanNumeral.get(splittedRoman[i+3])+" "+RomanNumeral.get(splittedRoman[i+3]));
//                    if(RomanNumeral.get(splittedRoman[i])<RomanNumeral.get(splittedRoman[i+3])){System.out.println("rekt"); valid=false; break;}}}
//                else if(Roman.length()-1!=i && RomanNumeral.get(splittedRoman[i])>RomanNumeral.get(splittedRoman[i+1])){
//                counter=1;
//                } else {
                
//            if (counter<3){
//                 counter=counter+1;
//            System.out.println("counter: "+counter);
//            System.out.println("success");break;}
//            
//            else {System.out.println("why"); valid=false; break;}
//            }
        }
        else if(RomanNumeral.get(splittedRoman[i])<=RomanNumeral.get(splittedRoman[i-1])){
            System.out.println("masukkurleb");
            if(splittedRoman[i].equals("I")||splittedRoman[i].equals("X")||splittedRoman[i].equals("C")||splittedRoman[i].equals("M")){
                System.out.println("masuk iterasi 1");
                counter=counter+1; 
                if(Roman.length()-1!=i && RomanNumeral.get(splittedRoman[i])>RomanNumeral.get(splittedRoman[i+1])){
                counter=0;
                }
                else {if (counter<3){
                    
                    System.out.println("counter"+counter);
                } else {System.out.println("counter: "+counter);valid=false; break;}}
                
            } else if(splittedRoman[i].equals("D")||splittedRoman[i].equals("V")||splittedRoman[i].equals("L")){
                System.out.println("masuk else");
               if(Roman.length()-1!=i && RomanNumeral.get(splittedRoman[i])>RomanNumeral.get(splittedRoman[i+1])){
                counter=0;
                } else {if (counter<0){
                    counter=counter+1;
                    System.out.println("counter"+counter);
                } else {System.out.println("break1");valid=false; break;}}
                
            }else{System.out.println("breakelse");valid=false; break; }
            
        } else {
            
            if(RomanNumeral.get(splittedRoman[i])>RomanNumeral.get(splittedRoman[i-1]) && splittedRoman[i-1].equals("I")||splittedRoman[i-1].equals("X")||splittedRoman[i-1].equals("C")){
            System.out.println(splittedRoman[i]+" "+RomanNumeral.get(splittedRoman[i]));
            System.out.println(splittedRoman[i-1]+" "+RomanNumeral.get(splittedRoman[i-1]));
        } else {System.out.println("break2");valid=false; break;}}
        
       } else { System.out.println("break3");valid=false; break;}
}
    
    return valid;
}
  
public int Convert(String roman) {
        int result = 0;
        String Roman = roman.toUpperCase(); //case-insensitive
        splittedRoman = Roman.split("");
        for (int i = 0; i < Roman.length() - 1; i++) {//loop over all but the last character
            if (RomanNumeral.get(splittedRoman[i]) < RomanNumeral.get(splittedRoman[i+1])) {
                result -= RomanNumeral.get(splittedRoman[i]);
            } else {
                result += RomanNumeral.get(splittedRoman[i]);
            }
        }
        result += RomanNumeral.get(splittedRoman[Roman.length() - 1]);
        return result;
    }

public HashMap<String, Integer> getRomanMap() {
         return RomanNumeral;
    }
  
}
