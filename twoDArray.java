/*
 two d array declration and taking input from user and print this : 
 */
package com.mycompany.lessons;

import java.util.Scanner;

public class twoDArray {
    
    static Scanner myscanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[][] array = new int[2][4];
        
        
        //prln("Enter your valus : ");
        //taking input from user : 
        for (int row = 0 ; row < 2; row++)
        {
            for (int colum = 0; colum < 4; colum++)
            {
                prln("Arr["+row+"] ["+colum+"] : ");
                array [row][colum]= myscanner.nextInt();
                
                
            }
        }
        
        for (int row = 0 ; row < 2; row++)
        {
            for (int colum = 0; colum < 4; colum++)
            {
                 prln( "  "+array [row][colum]);
            }
             prln("\n");
        }
       
    }
    
    static void prln(Object anyObject)
    {
        System.out.print(anyObject);
    }
    
    static void pr(Object anyObject)
    {
        System.out.println(anyObject);
    }
    
}
