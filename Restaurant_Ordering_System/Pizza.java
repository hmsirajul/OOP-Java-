/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Pizza extends Fooditems {
    String size;
    public Pizza (String name, double price, String size){
        super(name, price);
        this.size= size;
    }
    public double getPrice(){
        if(size.equalsIgnoreCase("Large"))
        {
            return Price ;
        }
        
        return Price ;
    }
    public void display()
    {
        prln("Pizza :" + name +"Size :" +size + "Price$ : "+ getPrice());
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
