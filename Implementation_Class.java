/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitytask;

class vehicles {

    protected double speed;
    protected int no_of_passengers;

    public vehicles(double speed, int passengers) {
        this.no_of_passengers = passengers;
        this.speed = speed;
    }

    void displayinfo() {
        System.out.println("Speed : " + speed + "km/h");
        System.out.println("Passengers :" + no_of_passengers + " ");
    }

}

class Car extends vehicles {

    public Car(double speed, int no_of_passengers) {
        super(speed, no_of_passengers);
    }
    @Override
    void displayinfo() {
        System.out.println("Car Details:");
        super.displayinfo();
    }

}

class Bus extends vehicles {

    public Bus(double speed, int no_of_passengers) {
        super(speed, no_of_passengers);
    }
    
    @Override

    void displayinfo() {
        System.out.println("Bus Details : ");
        super.displayinfo();
    }

}

public class Implementation_Class {

    public static void main(String[] args) {
        Car ob = new Car(120.00, 2);
        Bus ob1 = new Bus(100.00, 50);
        ob.displayinfo();
        System.out.println();
        ob1.displayinfo();
    }
}
