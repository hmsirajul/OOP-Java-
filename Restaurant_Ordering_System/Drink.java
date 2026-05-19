/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Drink extends Fooditems {
    boolean cold;
    public Drink (String name, double price, boolean cold){
        super(name, price);
        this.cold= cold;
    }
    public double getPrice(){
        if(cold)
        {
            return Price +1;
        }
        
        return Price ;
    }
    public void display()
    {
        prln("Drink :" + name +"Cold :" +cold + "Price$ : "+ getPrice());
    }
    
    //Print Mathodes; 
       
    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void pr(Object anyObject) {
        System.out.print(anyObject);
    }

    @Override
    public double Cal_Price() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void disp_Item() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
