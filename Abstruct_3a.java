/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitytask;

abstract class Store
{
   abstract double get_price();
   abstract void display_info();
   void showItem(){
       System.out.println(" All items info : ");
   }
}
class Bookstore  extends Store{
    @Override
    double get_price(){
    return 25.0f;
}
    void display_info(){
       System.out.println(" All items info : "); 
    }
}
class Ricestore extends Store{
    double get_price(){
    return 15.0f;
}
    void display_info(){
       System.out.println(" All items info : "); 
    }
}
public class Abstruct_3a {
    public static void main(String[] args){
        Bookstore ob = new Bookstore();
        ob.display_info();
        ob.get_price();
        System.out.println("Info : "+ob.get_price());
        
        
        Ricestore ob1 = new Ricestore();
        ob1.display_info();
        ob1.get_price();
        System.out.println("Info : "+ob.get_price());
    }
    
}
