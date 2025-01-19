
package com.mycompany.conditional.Control_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continue_Statement {
    public static void main(String[] args) throws IOException {
        int Number =0;
        String s;
        for (; ;)
        {
             InputStreamReader IN = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(IN);
            System.out.print("Enter a positive integer : ");
            s = BR.readLine();
            Number = Integer.parseInt(s);
            if(Number<=0)
            {
                continue;
            }
            else{
                
                break;
            }
            
        }
        System.out.print("You have entered : " +Number);
    }
    
}
