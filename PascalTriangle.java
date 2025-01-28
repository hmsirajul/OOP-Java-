
package com.mycompany.lessons;

import java.util.Scanner;

public class PascalTriangle {
    static Scanner myscanner = new Scanner(System.in);
    public static void main(String[] args) {
        
//        prln("Enter -1 to Exit ");
//        pr("Give me the length of pascal value : ");
//        int userInput = myscanner.nextInt();
//        while(userInput != -1){
//            if (userInput< -1 || userInput> 20)
//            {
//                prln("Enter your value in there : ");
//                userInput = myscanner.nextInt();
//                continue;
//                
//            }
//        }
//        
//        printpascalTriangle(userInput);
//        prln("\n\n");
//        prln("Enter your value in there 1 to 20 ");
//        userInput = myscanner.nextInt();
//        
//        
//        
//    }
//    static void printpascalTriangle(int length)
//            
//    {
//        int[][] array = new int[length][length];
//        for (int i = 0;i <length; i++){
//            array[0][i] = 1;
//            array[i][0]= 1;
//            
//        }
//        for (int row =1 ; row<length; row++){
//            for (int column =1; column<length-row; column++){
//                
//                array[row][column]= array[row][column-1]+ array[row-1][column];
//                
//            }
//        }
//        for (int row =0 ; row<length; row++){
//            for (int column =0; column<length-row; column++){
//                
//                prln(array[row][column]+"\t");                
//            }
//            pr("\n\n");
//        }
//        
//    }
//    
//    static void prln(Object anyObject){
//        System.out.print(anyObject);
//    }
//    static void pr(Object anyObject){
//        System.out.print(anyObject);
//    }
     prln("Enter -1 to Exit");
        while (true) {
            pr("Give me the length of Pascal's Triangle (1 to 20): ");
            int userInput = myscanner.nextInt();

            if (userInput == -1) {
                prln("Exiting...");
                break;
            }

            if (userInput < -1 || userInput > 20) {
                prln("Invalid input! Please enter a value between 1 and 20.");
                continue;
            }

            printPascalTriangle(userInput);
            prln("\n");
        }
    }

    static void printPascalTriangle(int length) {
        int[][] array = new int[length][length];

        // Generate Pascal's Triangle
        for (int row = 0; row < length; row++) {
            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    array[row][column] = 1;
                } else {
                    array[row][column] = array[row ][column - 1] + array[row - 1][column];
                }
            }
        }

        // Print Pascal's Triangle
        for (int row = 0; row < length; row++) {
            // Print spaces for alignment
            for (int space = 0; space < length - row - 1; space++) {
                pr("  ");
            }

            // Print values
            for (int column = 0; column <= row; column++) {
                pr(array[row][column] + "   ");
            }
            prln(""); // Move to the next line
        }
    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void pr(Object anyObject) {
        System.out.print(anyObject);
    }

}
