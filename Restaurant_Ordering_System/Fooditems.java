/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public abstract class Fooditems {
   // public abstract class Fooditem {
    double Price;
    String name;
    
    public Fooditems(String name, double Price){
        this.Price=Price;
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return Price;
    }
    
    public abstract double Cal_Price();
    public abstract void disp_Item();
    
      
}
