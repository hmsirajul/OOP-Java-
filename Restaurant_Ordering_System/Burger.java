/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Burger extends Fooditems{
    private boolean chese;
    
    public Burger(String name, double Price,boolean chese){
        super(name,Price);
        this.chese= chese;
        
    }
    public double getPrice(){
        if(chese){
            return Price +2;
        }
        
        return Price;
    }
    public void display()
    {
        prln("Burger :" + name +"Cheese :" +chese + "Price$ : "+ getPrice());
    }
    
    //Print Mathodes; 
       
    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void pr(Object anyObject) {
        System.out.print(anyObject);
    }

    
    public double Cal_Price() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public void disp_Item() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


