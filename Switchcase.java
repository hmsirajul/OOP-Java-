
package com.mycompany.conditional;

import java.io.*;

public class Switchcase {
    
    public static void main(String[] args) {
        int year = 0;
        String s;

        try {
            // Corrected class names and variable declarations
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            System.out.print("Enter your academic year (From 1 to 4): ");
            s = br.readLine(); // Read input as a string
            year = Integer.parseInt(s); // Convert input to an integer

            // Switch case to handle different inputs
            switch (year) {
                case 1:
                    System.out.println("You are a student of first year.");
                    break;
                case 2:
                    System.out.println("You are a student of second year.");
                    break;
                case 3:
                    System.out.println("You are a student of third year.");
                    break;
                case 4:
                    System.out.println("You are a student of fourth year.");
                    break;
                default:
                    System.out.println("You are not a student.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
        }
    }
}


