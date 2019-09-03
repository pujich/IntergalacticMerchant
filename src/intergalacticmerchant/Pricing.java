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
    public HashMap<String, Integer> GoodsPrice = new HashMap<String, Integer>() {
	{
		put("Silver", 0);
                put("Gold", 0);
		put("Iron", 0);
	}};
    private boolean valid=true;
    
    public boolean UpdatePrice(String Goods, int Price){
        if(GoodsPrice.containsKey(Goods)){
            GoodsPrice.replace(Goods, Price);
            valid=true;
            System.out.println("Price has been put");
        } else { valid=false;
        System.out.println("Sorry, we don't sell those");
        }
        
        return valid;
    }
    
    public HashMap<String, Integer> getGoodsPriceMap() {
         return GoodsPrice;
    }
    
    public int CountCredits(String Goods, int Qty){
    int total=0;
    total=GoodsPrice.get(Goods)*Qty;
    return total;
    }
}
