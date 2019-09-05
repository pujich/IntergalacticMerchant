/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalacticmerchant;

import java.util.Scanner;

/**
 *
 * @author Puji
 */
public class IntergalacticMerchant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        InputProcessor IP = new InputProcessor();
        while(sc.hasNext()){
            String input = sc.nextLine();
            try {
                if(IP.ReadInput(input).equals("")){     //if input isn't supposed to return
                    
                } 
                else {
                    System.out.println(IP.ReadInput(input));   //to return result
                }
            }  
            catch(Exception e){  
                System.out.println("Exception Occured in Input Processing.");
            } 
        }        
    }   
}
