package com.mycompany.universitytask;
import java.util.Scanner;

abstract  class Calculator {

    double x, y;
    abstract double min(double e, double z);
    abstract double multi(double e, double z);
    abstract double div(double e, double z);

    double sum(double a, double b) {
        x = a;
        y = b;
        double c = x + y;
        return c;
    }

}

class AbstractImplementedClass extends Calculator {

    void hello() {
        System.out.println("This is abstruct Implemtnted : ");
    }
    
    @Override

    public double multi(double a, double b) {
        x = a;
        y = b;
        double c = x * y;
        return c;
    }
    @Override

    public double min(double a, double b) {
        x = a;
        y = b;
        double c = x - y;
        return c;
    }
    
    @Override

    public double div(double a, double b) {
        x = a;
        y = b;
        double c = x / y;
        return c;
    }
}

public class Abstract_Calculation_Exmpls {

   static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        AbstractImplementedClass c = new AbstractImplementedClass();
        
        System.out.println("Enter first value: ");
        double num1 = myScanner.nextDouble();

        System.out.println("Enter second value: ");
        double num2 = myScanner.nextDouble();

        c.hello();
        
        System.out.println("Summation of a and b: " + c.sum(num1, num2));
        System.out.println("Multiplication of a and b: " + c.multi(num1, num2));
        System.out.println("Subtraction of a and b: " + c.min(num1, num2));
        System.out.println("Division of a and b: " + c.div(num1, num2));
    }
}
