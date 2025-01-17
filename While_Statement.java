
package com.mycompany.conditional.Control_Statements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class While_Statement {
    public static void main(String[] args) {
       int N1 = 0, N2 = 0, GCD = 0;
        String S1, S2;

        try {
            InputStreamReader IN = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(IN);

            System.out.print("Enter the first nonnegative integer: ");
            S1 = BR.readLine();
            System.out.print("Enter the second nonnegative integer: ");
            S2 = BR.readLine();

            N1 = Integer.parseInt(S1);
            N2 = Integer.parseInt(S2);

            if (N1 < 0 || N2 < 0) {
                System.out.println("Please enter nonnegative integers only.");
                return;
            }

            while (N2 != 0) {
                GCD = N1 % N2;
                N1 = N2;
                N2 = GCD;
            }

            System.out.println("The Greatest Common Divisor (GCD) is: " + N1);

        } catch (IOException e) {
            System.out.println("An input error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
    
}
