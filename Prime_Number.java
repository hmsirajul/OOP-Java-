
package com.mycompany.conditional.Control_Statements;


public class Prime_Number {
    public static void main(String[] args) {
        int i =0, j=0;
        System.out.print("Series of prime numbers of upto 25 is:\n ");
        for ( i =2;i<=25;i++)
        {
            for ( j =2; j<=i;j++)
            {
                if (i%j ==0)
                
                    break;
                
            }
            if (i == j)
                System.out.print(" " +i + " ");
            
        }
    }
}
