
//Write a Java Program to make a Simple Calculator using Switch Case.

package com.mycompany.universitytask;

import java.util.Scanner;


public class UniversityTask {

    static Scanner myscanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        prln("Select Operation:");
        prln("1. Operator ( + )");
        prln("2. Operator ( - )");
        prln("3. Operator ( * )");
        prln("4. Operator ( / )");

       
        prln("Enter Your Option (1/2/3/4):");
        int choice = myscanner.nextInt();

    
        prln("Enter Your First Number:");
        double choice1 = myscanner.nextDouble();

        prln("Enter Your Second Number:");
        double choice2 = myscanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = choice1 + choice2;
                pr("Addition: " + result);
                break;
            case 2:
                result = choice1 - choice2;
                pr("Subtraction: " + result);
                break;
            case 3:
                result = choice1 * choice2;
                pr("Multiplication: " + result);
                break;
            case 4:
                if (choice2 != 0) {
                    result = choice1 / choice2;
                    pr("Division: " + result);
                } else {
                    prln("Error!");
                }
                break;
            default:
                prln("Invalid option!");
                break;
        }
  
    }   
    static void prln(Object anyObject)
    {
        System.out.print(anyObject);
    }
    static void pr(Object anyObject)
    {
        System.out.print(anyObject);
    }
}
