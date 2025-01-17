
package com.mycompany.conditional.Control_Statements;

public class Combination_For {
    
    public static void main(String[] args) {
  
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(C(i, j) + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Method to calculate combinations C(x, y) = P(x, y) / F(y)
    static long C(int x, int y) {
        return P(x, y) / F(y);
    }

    // Method to calculate permutations P(x, y)
    static long P(int x, int y) {
        long p = 1;
        for (int i = 0; i < y; i++) {
            p = p * x;
            x--;
        }
        return p;
    }

    // Method to calculate factorial F(z)
    static long F(int z) {
        long f = 1;
        while (z > 1) {
            f = f * z;
            z--;
        }
        return f;
    }
}

    

