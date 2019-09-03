/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticmerchant;

/**
 *
 * @author Puji
 */
public class IntergalacticMerchant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RomanConverter RC = new RomanConverter();
        String roman="XCXIX";
        
        System.out.println(RC.RomanChecker(roman));
        System.out.println(RC.Convert(roman));
    }
    
}
