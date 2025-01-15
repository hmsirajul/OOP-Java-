
package com.mycompany.conditional;

import java.io.DataInputStream;

public class Else_if_else_if_2 {
     public static void main(String[] args) {
        DataInputStream in = new DataInputStream(System.in);
        char Ch;
        try
        {
            System.out.print("Enter your characterar to be tested : ");
            Ch = (char) System.in.read();
            if((Ch >= 'A') && (Ch <= 'Z'))
                System.out.print("Enter capital Latter : " +Ch);
            else if((Ch >= 'a') && (Ch <='z'))
                System.out.print("Enter small Latter : " +Ch);
            else
                System.out.print("The letter you entered is not a charecter : ");
        }
        catch (Exception E)

        {
           //System.out.println("Hello World");
        }
    }
}
