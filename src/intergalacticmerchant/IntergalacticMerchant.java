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
        String input;
        
        while(true){
        input = sc.nextLine(); 
        System.out.println(IP.ProcessInput(input));
        }
//        System.out.println(IP.ProcessInput("glob is I"));
//        System.out.println(IP.ProcessInput("prok is V"));
//        System.out.println(IP.ProcessInput("pish is X"));
//        System.out.println(IP.ProcessInput("tegj is L"));
//        System.out.println(IP.ProcessInput("glob glob Silver is 34 Credits"));
//        System.out.println(IP.ProcessInput("glob prok Gold is 57800 Credits"));
//        System.out.println(IP.ProcessInput("pish pish Iron is 3910 Credits"));
//        System.out.println(IP.ProcessInput("how much is pish tegj glob glob ?"));
//        System.out.println(IP.ProcessInput("how many Credits is glob prok Silver ?"));
//        System.out.println(IP.ProcessInput("how many Credits is glob prok Gold ?"));
//        System.out.println(IP.ProcessInput("how many Credits is glob prok Iron ?"));
//        System.out.println(IP.ProcessInput("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?"));

        
    }
    
}
