
package com.mycompany.conditional.Control_Statements;
/*
    printint  reverse order ;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Do_While_Statement {
    public static void main(String[] args) throws IOException {
        int Number =0, RightDigit=0;
        String s;
        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IN);
        System.out.print("Enter the number to be reversed : ");
        s = BR.readLine();
        Number = Integer.parseInt(s);
        System.out.print("The Number in Reverse order is : ");
        do
        {
            RightDigit = Number % 10;
            System.out.print(" " +RightDigit);
            Number = Number/10;
            
        }
        while(Number !=0);

    }
}
