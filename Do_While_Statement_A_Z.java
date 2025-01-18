
package com.mycompany.conditional.Control_Statements;

/**
 *
 * print A to Z ;
 */

public class Do_While_Statement_A_Z {
    public static void main(String[] args) {
        {
            char Ch ='A';
            do{
                System.out.print("" +Ch + " ");
                Ch++;
            }
            while((Ch >= 'B') && (Ch <= 'Z'));
        }
    }
}
