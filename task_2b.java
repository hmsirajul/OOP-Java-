
package com.mycompany.universitytask;

class Cricket{
    int a , b;
    char c;
    public Cricket(int a,int b, char c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void dispalyinfo(){
        System.out.println("In Cricket Class");
    }
    
}
class Football extends Cricket {
   
    Football(int a, char c){
        
        super(int a, char c);
    }
    void displayinfo(){
        System.out.println("In Football Class");
        super.dispalyinfo();
    }
}
class Badminton extends Football{
     Badminton (int a, char c){
        
        super(a, c);
    }
    void displayinfo(){
        System.out.println("In Badminton Class");
        super.dispalyinfo();
    }
}
public class task_2b {
    public static void main(String[] args){
       Badminton ob= new Badminton(10, 'X');
        ob.dispalyinfo();
    }
}
