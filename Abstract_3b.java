
package com.mycompany.universitytask;
abstract class shape{
    double length, wigth;
    void setData(double l, double w){
        length=l;
        wigth = w;
        
    }
    abstract double display_area();
}
class traingle extends shape{
    @Override
    double display_area(){
        return 0.5*wigth*length;
    }
}
class rectangle extends shape{
    @Override
    double display_area(){
        return wigth*length;
    }
}
public class Abstract_3b {
    public static void main(String[] arges){
        shape shape1 = new traingle();
        shape1.setData(10, 5);
        System.out.println("Triangle Area: " + shape1.display_area());

        shape shape2 = new rectangle();
        shape2.setData(10, 5);
        System.out.println("Rectangle Area: " + shape2.display_area());
    }
}
