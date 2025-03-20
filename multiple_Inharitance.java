/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitytask;

interface A{
    void display();
}

interface B{
    void display();
}
class C implements A,B{
    @Override
    public void display(){
        System.out.println("");
    }
}
public class multiple_Inharitance {
    public static void main(String[] args){
        C ob= new C();
        ob.display();
    }
    
}
