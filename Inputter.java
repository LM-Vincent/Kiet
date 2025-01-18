/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uitilities;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Inputter {
    private static  final Scanner sc = new Scanner(System.in);
    public static  String getString(String prompt, int min, int max){
        String input;
        while (true) {
            System.out.println(prompt);
            input= sc.nextLine().trim().replaceAll("\\s+"," ");
            if(input.length() >= min && input.length()<= max){
                return input;
            }else{
                System.out.println("Invalid format.Please try again!");
            }
        }
    }
    
    public static int getInt(String prompt, int min, int max){
        int input;
        while (true) {            
            try {
                System.out.println(prompt);
                input=Integer.parseInt(sc.nextLine().trim());
                if(input >= min && input <= max){
                    return input;
                }
            } catch (NumberFormatException e) {
                
            }
        }
    }
    
    public static double getDouble(String prompt, double min, double max){
        double input;
        while (true) {            
            try {
                System.out.println(prompt);
                input=Integer.parseInt(sc.nextLine().trim());
                if(input >= min && input <= max){
                    return input;
                }
            } catch (NumberFormatException e) {
                
            }
        }
        
    }
}
