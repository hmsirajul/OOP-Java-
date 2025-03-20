
package com.mycompany.universitytask;
class Grandfather{
    int age;
    String Name;
    Grandfather(int age , String Name)
    {
        this.age = age;
        this.Name =Name;
    }
    void displayinfo(){
        System.out.println("Grandfather Age of  : "+age);
        System.out.println("Grandfather Name is   : "+Name);
    }
}
class Father extends Grandfather
{
    public Father(int age , String Name){
         super(age, Name);
    }
    @Override
    void displayinfo(){
       
        System.out.println("Father :");
        super.displayinfo();
    }
           
    
}
class Son extends Father
{
    public Son(int age , String Name){
    super(age, Name);
    }
    @Override
    void displayinfo(){
       
        System.out.println("Son :");
        super.displayinfo();
    }
}

public class Implements_2b {
    public static void main(String[] args){
        Grandfather ob = new Grandfather( 25, "Rahul");
        ob.displayinfo();
        
        //System.out.println(" "+ob.Grandfather());
    }
}
