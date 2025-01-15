
package com.mycompany.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Else_if_else_if {
           public static void main(String[] args) {
        int age = 0;
        String s;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.print("Enter your age: ");
            s = br.readLine();           // user input ; 
            age = Integer.parseInt(s);  // convarting int to string; 

            if (age <= 0) {
                System.out.println("You have not been born yet!");
            } else if (age > 0 && age <= 12) {
                System.out.println("You are a child.");
            } else if (age > 12 && age <= 19) {
                System.out.println("You are a teenager.");
            } else if (age > 19 && age <= 40) {
                System.out.println("You are young.");
            } else if (age > 40) {
                System.out.println("Wish you a long life.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}



