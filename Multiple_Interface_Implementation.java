/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitytask;

interface Analul{
    void makesound();
}
interface Pet{
    void showAffection();
}
class Cat implements Analul, Pet{
    //Passing some value in this 
    private String name;
    public void Cat(String name){
        this.name= name;
    }
    @Override
    public void makesound(){
        System.out.println(" Pet makes sound : ");
    }
    @Override
    public void showAffection(){
        System.out.println("People Loves pet ");
    }
    public String getname(){
        return name;
    }
}
public class Multiple_Interface_Implementation {
    public static void main(String[] args){
        Cat ob = new Cat();
        ob.makesound();
        ob.showAffection();
        ob.Cat("Magpie");
        System.out.println("My cat Name: "+ob.getname());
        
    }
}
