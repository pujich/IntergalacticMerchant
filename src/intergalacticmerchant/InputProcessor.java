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
public class InputProcessor{
    
    private RomanConverter RC = new RomanConverter();
    private HashMap<String, Integer> Roman = RC.getRomanMap();
    
    private Pricing Pricing = new Pricing();
    public HashMap<String, Integer> Price = Pricing.getGoodsPriceMap();
    
    private Translator Translator = new Translator();
    public HashMap<String, String> Words = Translator.getLangMap();

    private String Response="";
    private String StringTemp="";
    private String RomanTemp="";
    private String[] DicedInput;
    private int QtyConversion;
    private int PriceResult;
    private int i;

    
    public String ProcessInput(String Input){
        
        DicedInput=Input.split(" ");
        
        for(int j=0; j<DicedInput.length; j++){
//            System.out.println(DicedInput[j]);
        }
        
        if (DicedInput.length==3 && DicedInput[1].equals("is")){	//buat masukin space currency
	if (Roman.containsKey(DicedInput[2])){
            Translator.LangInput(DicedInput[0], DicedInput[2]); 
//        System.out.println("--------------------------");
//        System.out.println(DicedInput.length+" "+DicedInput[1]);
//        System.out.println("--------------------------");
        }
        else{
            Response = "Sorry, the character you inputted doesn't belong in the roman number"; }
	}
//
      else if (Input.startsWith("how much is") && Input.endsWith("?")){
	
	for(i=3; i<DicedInput.length-1; i++){	//iterasi identifikasi bagian2 yang adalah space currency
	if(Words.containsKey(DicedInput[i])){
            RomanTemp+=Words.get(DicedInput[i]);
            StringTemp+=DicedInput[i]+" ";
        } else {
            Response = "Sorry, the language you inputted is incomprehensible"; }
	}
      if(RC.RomanChecker(RomanTemp)==true){
	QtyConversion=RC.Convert(RomanTemp);
      Response = StringTemp+"is "+QtyConversion; 
      RomanTemp="";
      StringTemp="";
      }
      else {
          Response = "Sorry, the roman number is incorrect"; }
	
}
//
          else if (Input.startsWith("how many Credits is") && Input.endsWith("?")){
	i=4;
	while (Words.containsKey(DicedInput[i])){	//iterasi identifikasi bagian2 yang adalah space currency
	RomanTemp+=Words.get(DicedInput[i]);
            StringTemp+=DicedInput[i]+" ";
	i++;}
         if(RC.RomanChecker(RomanTemp)==true){
	QtyConversion=RC.Convert(RomanTemp);} 
         else {
             Response = "Sorry, the roman number is incorrect"; 
         }
	if(Price.containsKey(DicedInput[i])){
	PriceResult = Price.get(DicedInput[i])*QtyConversion/*kali value dan hasilkonversi*/;
	Response = StringTemp+""+DicedInput[i]+" is "+PriceResult+" Credits";
        RomanTemp="";
        StringTemp="";
	} else {Response = "Sorry, we don't sell that"; 
//        System.out.println(DicedInput[i]);
//        System.out.println(DicedInput[Price.get(DicedInput[i])*QtyConversion]);
        }
}
//
          else if (Words.containsKey(DicedInput[0]) && Input.endsWith("Credits")){	//buat masukin harga goods
              i=0;
            while (Words.containsKey(DicedInput[i])){	//iterasi identifikasi bagian2 yang adalah space currency
                
                RomanTemp+=Words.get(DicedInput[i]);
                StringTemp+=DicedInput[i]+" ";
                i++;}
	
        if(RC.RomanChecker(RomanTemp)==true){
	QtyConversion=RC.Convert(RomanTemp);
        
        if(Price.containsKey(DicedInput[i])){		//jika stelahnya adlh goods name
//		System.out.println(DicedInput[DicedInput.length-3]+" - "+isNumber(DicedInput[DicedInput.length-2]));
		if(DicedInput[DicedInput.length-3].equals("is") && isNumber(DicedInput[DicedInput.length-2]) ){
                    Price.put(DicedInput[i], Integer.parseInt(DicedInput[DicedInput.length-2])/QtyConversion);
                    RomanTemp="";
                    StringTemp="";
			} else {
                    Response="I have no idea what you are talking about B"; }
		}
        } 
         else {
//            System.out.println(RomanTemp);
             Response = "Sorry, the roman number is incorrect";
         }

	}
          else {
            Response="I have no idea what you are talking about";}

        
        return Response;
    }

        private boolean isNumber(String Char){
            try {  
             Integer.parseInt(Char);  
             return true;
         } catch(NumberFormatException e){  
             return false;  
             }  

        }
}
