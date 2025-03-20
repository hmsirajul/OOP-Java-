/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitytask;

abstract class Vehicle{
    abstract void start();
    void stop(){
        System.out.println("Car is stop now...");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car is Start now...");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Car is Start now...");
    }
}
public class Abstract {
    public static void main(String[] args){
        Car ob = new Car();
        ob.start();
        Bike ob1 = new Bike();
        ob1.start();
        ob1.stop();
    }
    
}
