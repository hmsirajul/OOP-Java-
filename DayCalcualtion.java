
package com.mycompany.universitytask;
import java.util.Scanner;
public class DayCalcualtion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number  : ");
        int day = sc.nextInt();
        System.out.print("operation");
        double a = sc.nextDouble();
        
        System.out.print("operation");
        char b = sc.next().charAt(0);
        
        System.out.print("operation");
        double c = sc.nextDouble();
        
        double result;
        
//        switch(day){
//            case 1 : System.out.print("Sat");
//            break;
//            case 2 : System.out.print("sun");
//            break;
//            case 3 : System.out.print("Mon");
//            break;
//            case 4 : System.out.print("Tue");
//            break;
//            case 5 : System.out.print("Wed");
//            break;
//            case 6 : System.out.print("Thu");
//            break;
//            case 7 : System.out.print("Fri");
//            break;
//            default: System.out.print("NO Operation :" );
//            break;
//            
//        }  


switch(b){
            case ''+' : result = a+c;
                System.out.print("add"+result);
            break;
            case' - ': result = a-c;
                System.out.print("sub"+result);
            break;
            case '*' : result = a*c;
                System.out.print("mul"+result);
            break;
            case '/' : if (num2 != 0) {
                          result = num1 / num2;
                          System.out.println("Result: " + result);
                      } else {
                          System.out.println("Error! Division by zero is not allowed.");
                      }
            break;
           
            default: System.out.print("NO Operation :" );
            break;
            
        }      
    }
    
}
