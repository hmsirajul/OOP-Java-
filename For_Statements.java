
package com.mycompany.conditional.Control_Statements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class For_Statements {
    public static void main(String arg[])
    {
        int n=0,sum=0;
        String s;
        try
        {
            BufferedReader BR  = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter value of N (>=1) : ");
            s= BR.readLine();
            n = Integer.parseInt(s);
            System.out.println("N  1+2+3+.......+ N ");
            System.out.print("......................");
            for(int i =0; i<=n;i++)
            {
                sum = sum+1;
                System.out.println("" +i + "\t\t" +sum);
               // printf("\n");
            }
        }
        catch(Exception e)
        {
            System.out.print(" Error not founded : " +e.getMessage());
        }
        
    }
    
}
