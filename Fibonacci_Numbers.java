
package com.mycompany.conditional.Control_Statements;

public class Fibonacci_Numbers {
    
    public static void main(String[] args) {
        int k =0, j=1, f;
        System.out.print("Enter First Fibonacci Numbers  : ");
        for ( int i=1; i<=10; i++)
        {
            f = k+j;
            System.out.println(" " +f + " ");
            j=k;
            k=f;
        }
    }
}
