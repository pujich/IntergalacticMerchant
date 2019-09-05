/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticmerchant;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Puji
 */
public class InputProcessor{
    
    private RomanConverter RC = new RomanConverter();
    private HashMap<String, Integer> Roman = RC.getRomanMap();
    
    private Pricing Pricing = new Pricing();
    public HashMap<String, Double> Price = Pricing.getGoodsPriceMap();
    
    private Translator Translator = new Translator();
    public HashMap<String, String> Words = Translator.getLangMap();

    private DecimalFormat RemoveZero = new DecimalFormat("###.#");
    
    private String Response="";
    private String StringTemp="";
    private String RomanTemp="";
    private String[] DicedInput;
    private int QtyConversion;
    private double PriceResult;
    private int i;

    public String ReadInput(String Input){      //to be able to read multiple lines of input (if any)
        DicedInput = Input.split("\\s?\\r?\\n");
        Input=ProcessInput(Stream.of(DicedInput).collect(Collectors.joining()));
        return Input;
    }
    
    private String ProcessInput(String Input){      //to recognize input sentence as command template
        DicedInput=Input.split(" ");
        
        if (DicedInput.length==3 && DicedInput[1].equals("is")){	//for adding space-roman dictionary
            Response="";
            Translator.LangInput(DicedInput[0], DicedInput[2]); //adding the space-roman dictionary  
	}

        else if (Input.startsWith("how much is") && Input.endsWith("?")){ //for 'how much is ... ?' questions
            Response="";
            while (Words.containsKey(DicedInput[i])){	//isSpaceLanguage iteration
                RomanTemp+=Words.get(DicedInput[i]);
                StringTemp+=DicedInput[i]+" ";
                i++;
            }
            if(RC.RomanChecker(RomanTemp)==true){        //check and convert roman
                QtyConversion=RC.Convert(RomanTemp);
                Response = StringTemp+"is "+QtyConversion;    //setting response
                RomanTemp="";
                StringTemp="";
            }
            else {
                Response = "Sorry, your language input is incorrect"; 
            }
        }

        else if (Input.startsWith("how many Credits is") && Input.endsWith("?")){   //for "how many Credits..." questions
            Response="";
            i=4;
            while (Words.containsKey(DicedInput[i])){	//isSpaceLanguage iteration
                RomanTemp+=Words.get(DicedInput[i]);
                StringTemp+=DicedInput[i]+" ";
                i++;
            }
            if(RC.RomanChecker(RomanTemp)==true){          
                QtyConversion=RC.Convert(RomanTemp);
                if(Price.containsKey(DicedInput[DicedInput.length-2])){
                    PriceResult = Pricing.CountCredits(DicedInput[i], QtyConversion); /*kali value dan hasilkonversi*/
                    Response = StringTemp+""+DicedInput[i]+" is "+RemoveZero.format(PriceResult)+" Credits";
                    RomanTemp="";
                    StringTemp="";
                } 
                else {
                    Response = "Sorry, we don't sell that"; 
                }
            } 
            else {
                Response = "Sorry, your language input is incorrect"; 
            } 
        }

        else if (Words.containsKey(DicedInput[0]) && Input.endsWith("Credits")){	//for adding good's price
            i=0;
            while (Words.containsKey(DicedInput[i])){	
                RomanTemp+=Words.get(DicedInput[i]);
                StringTemp+=DicedInput[i]+" ";
                i++;
            }
            if(RC.RomanChecker(RomanTemp)==true){
                QtyConversion=RC.Convert(RomanTemp);
                if(Price.containsKey(DicedInput[i])){		//if the next string is a good's name
                    if(DicedInput[DicedInput.length-3].equals("is") && isNumber(DicedInput[DicedInput.length-2]) ){
                        Price.put(DicedInput[i], Pricing.CountPrice(DicedInput[DicedInput.length-2], QtyConversion)); //inputting the price
                        Response="";
                        RomanTemp="";
                        StringTemp="";
                    } else {
                        Response="I have no idea what you are talking about"; 
                    }
		}
            } 
            else {
                Response = "Sorry, your input is incorrect";
            }
	}
        
        else {                                                      
            Response="I have no idea what you are talking about";    //if the input is unrecognizable
        }
        return Response;
    }

    private boolean isNumber(String Char){  //check if a string number or not
        try{  
            Integer.parseInt(Char);  
            return true;
        } 
        catch(NumberFormatException e){  
            return false;  
        }  

    }
}
