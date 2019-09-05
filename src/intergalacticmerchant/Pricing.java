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
public class Pricing {
    public HashMap<String, Double> GoodsPrice = new HashMap<String, Double>() { //goods-price list
	{
		put("Silver", 0.0);
                put("Gold", 0.0);
		put("Iron", 0.0);
	}};
    private boolean valid=true;
    private double total=0;
    
    public boolean UpdatePrice(String Goods, Double Price){ //giving price to goods
        if(GoodsPrice.containsKey(Goods)){
            GoodsPrice.replace(Goods, Price);
            valid=true;
            System.out.println("Price has been put");
        } else { 
            valid=false;
            System.out.println("Sorry, we don't sell those");
        }
        
        return valid;
    }
    
    public HashMap<String, Double> getGoodsPriceMap() { //to transfer goods hashmap
        return GoodsPrice;
    }
    
    public double CountCredits(String Goods, int Qty){ //to count total credits
        try{
            total=GoodsPrice.get(Goods)*Qty;
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException Occured at CountCredits");
        }
        return total;
    }
    
    public double CountPrice(String Credits, int Qty){ //to count a single good's price
        try{
            total=Double.parseDouble(Credits)/Qty;
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException Occured at CountPrice");
        }
        return total;
    }
}
