/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitytask;
class A{
    void showA(){
        System.out.println("49 intake!!! Best of Luck for your exam !!");
        
    }
    
}
class C extends A{
    
}
class D extends A{
    
}
interface H_C{
    void showA();
        
}
interface H_D{
    void showA();
        
}
class E implements H_C , H_D{
    public void showA(){
        System.out.println("49 intake!!! Best of Luck for your exam !!");      
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args){
        E obj = new E();
        obj.showA();
    }
    
}
