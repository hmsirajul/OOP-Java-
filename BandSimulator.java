/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitytask;
interface musical{
    void play();
}
class guter implements musical{
    @Override
    public void play(){
        System.out.println(" Opps Opss");
    }
}
class Drum implements musical{
    @Override
    public void play(){
        System.out.println(" BOOm BooM ");
    }
}
class piano implements musical{
    @Override
    public void play(){
        System.out.println("Heeep Heee ");
    }
}
public class BandSimulator {
    public static void main(String[] args){
        musical[] array={
        new guter(),
        new Drum(),
        new piano()
    };
        System.out.println("This is a new musice :");
        for (musical ob : array){
            ob.play();
        }
         System.out.println("This is a musics : ");
    }
}
