
package com.mycompany.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Else_if 
{
    public static void main(String arg[])
    {
        int year =0;
        String s;
        try
        {
       InputStreamReader IN = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(IN);
            System.out.print("Enter the year to be tested: ");
            s = BR.readLine();
            year = Integer.parseInt(s);

            // Corrected leap year logic
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (Exception e) {
            //System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
