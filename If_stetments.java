/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conditional;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class If_stetments {
    public static void main(String args[])
    {
        int Age =0;
        String s;
        try
        {
            InputStreamReader IN = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(IN);
            System.out.print("Enter your age : ");
            s = BR.readLine();
            Age = Integer.parseInt(s);
            if(Age<=0)
            {
                System.out.print("You have not bored yet !");
                if(Age >0 && Age <=12)
                    System.out.print("You are a child : ");
                if(Age >12 && Age <=19)
                    System.out.print("You are a teen ager : ");
                if(Age>40)
                    System.out.print("Wish you are young ! ");
            }
        }
        catch (NumberFormatException E )
                {
                 System.out.println("Invalid input! Please enter a valid number.");   
                }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
