/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main( String [] args){
        Scanner sr = new Scanner (System.in);
        
        ArrayList<Fooditems> order = new ArrayList<> ();
        int choice ;
        do{
           prln("\n****** MENU ******");
           prln("1. Add Burger : ");
           prln("2. Add Pizza : ");
           prln("3. Add Drink : ");
           prln("4. Show Bill : ");
           prln("5. Exit : ");
           
           prln("Ente Choice: ");
           choice =sr.nextint();
           sr.nextLine();
           switch(choice ){
               case 1: 
                   prln("");
                 break;
               case 2:
                   prln("");
                 break;
           }
        }
        while (choice != 0){
        sr.close();
        
    }
    }
    
    
    
    
    //Print Mathodes; 
       
    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void pr(Object anyObject) {
        System.out.print(anyObject);
    }
}
