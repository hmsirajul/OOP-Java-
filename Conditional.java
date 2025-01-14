//
//package com.mycompany.conditional;
//
//
//import java.io.*;
//
//public class Conditional {
//    public static void main(String[] args) {
//        // Use BufferedReader for input
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        char ch;
//
//        System.out.print("Enter A or a or B or b: ");
//
//        try {
//            // Read a single character input
//            ch = (char) reader.read();
//
//            // Switch case to handle different inputs
//            switch (ch) {
//                case 'A':
//                    System.out.println("You have entered: A");
//                    break;
//                case 'a':
//                    System.out.println("You have entered: a");
//                    break;
//                case 'B':
//                    System.out.println("You have entered: B");
//                    break;
//                case 'b':
//                    System.out.println("You have entered: b");
//                    break;
//                default:
//                    System.out.println("You haven't entered A, a, B, or b.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading input: " + e.getMessage());
//        }
//    }
//}
