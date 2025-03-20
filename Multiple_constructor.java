//overloding value  : 

package com.mycompany.universitytask;

class A {

    private int n1;

    public A() {
        n1 = 6;
    }

    public A(int n2) {
        n1 = n2;

    }

    public A(int n3, int n4) {
        n1 = n3;
        n1 = n4;
    }

    public void display() {
        System.out.println("Value is : " + n1);
    }
    
    public void display(String value) {
        System.out.println(value+"Value is : " + n1);
    }

}

class B {

    private int n1;

    public B() {
        n1 = 6;
    }

    public B(int n2) {
        n1 = n2;

    }

    public B(int n3, int n4) {
        n1 = n3;
        n1 = n4;
    }

    public void display() {
        System.out.println("Value is : " + n1);
    }
    public void display(String value) {
        System.out.println(value+"Value is : " + n1);
    }

}

public class Multiple_constructor {

    public static void main(String[] args) {
        
        B ob = new B(1);
        ob.display();
        
        A ob1 = new A(10);
        ob1.display();
        
        ob.display("This overloded B:");  
        ob1.display("This overloded A:"); 

    }

}
