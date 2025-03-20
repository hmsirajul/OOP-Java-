/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitytask;
interface PolygonArea{
    void area();
}
class concespt implements PolygonArea{

    private double Area;
    public concespt(double Area){
        this.Area=Area;   
    }
    //@Override
    void area(  double Area){
        double result = Math.PI*Area*Area;
        System.out.println("Area of Circle : "+result);
    }
}
class concespt_1 implements PolygonArea {
   
    private double length;
    private double wigth;
    public concespt_1(  double length , double wigth){
        this.length=length;
        this.wigth=wigth;
    }
     // @Override
    void area(  double length , double wigth){
        double result = length *wigth;
        System.out.println("Area of Circle : "+result);
    }
}

//// Again other parts Overlodin; 

//class concespt{
//   
//    void area(  double Area){
//        double result = Area;
//        System.out.println("Area of Circle : "+result);
//    }
//    void area(  double length , double wigth){
//        double result = length *wigth;
//        System.out.println("Area of Circle : "+result);
//    }
//}

public class Overloading_With_Method {
    public static void main(String[] args){
//       concespt ob = new concespt();
//       ob.area(5);
//       ob.area(5, 5);
 PolygonArea ob = new concespt(2.0);
 ob.area();
 PolygonArea ob1 = new concespt_1(2.3,3.5);
 ob1.area();
 

    }
}
