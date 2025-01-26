
package com.mycompany.lessons;

import java.util.Scanner;

public class BookStore {
    
    static Scanner myscanner = new Scanner(System.in);
    static String[] books = { "Java" , "C", "C+", "Python" };
    static final double studentDiscount = 0.3;
    static final double teacherDiscount = 0.4;
    static final double alianDiscount = 0.1;
    public static void main(String[] args) {
        
        //Wellcoming interface : 
        
        prln("----------------Wellcome to our Book Store----------------");
        prln("Which book do you want?\nAns :  ");
        
        // UserInput :
        
        String userChoice = myscanner.nextLine();
        
        // checking conditions for all type of case : 
        
        if ( books[0].toLowerCase().equals(userChoice.toLowerCase()))
        {
            prln("Your option is:"+books[0]+ " Book.");
            calculation(books[0]);
        }
        else if ( books[0].toLowerCase().equals(userChoice.toLowerCase()))
        {
            prln("Your option is :"+books[1]+ " Book.");
            calculation(books[1]);
        }
        else if ( books[0].toLowerCase().equals(userChoice.toLowerCase()))
        {
            prln("Your option is :"+books[2]+ " Book.");
            calculation(books[2]);
        }
        else if ( books[0].toLowerCase().equals(userChoice.toLowerCase()))
        {
            prln("Your option is :"+books[3]+ " Book.");
            calculation(books[3]);
        }
        else
        {
            prln("Sorry , we don't have this books !! ");
        }
       
    }
    
    static void calculation (String bookname)
    {
        prln("Are you a Student , Teacher, Alian");
        String answer = myscanner.nextLine();
        
        double price = 200;
        if(answer.toLowerCase().equals("teacher"))
        {
            price = price-(price*teacherDiscount);
            Showprice(price );
            
        }
        else if(answer.toLowerCase().equals("student"))
        {
            price = price-(price*studentDiscount);
            Showprice(price );
        }
        else if(answer.toLowerCase().equals("alian"))
        {
            price = price-(price*alianDiscount);
            Showprice(price );
        }
        else
        {
            prln("Sorry , we can't serve you !! ");
        }
        
    }
    
    static void Showprice( double price )
    {
       prln("Your payable Balance is : "+price);
       prln("---------------THANK YOU----------------");
    }
    
    static void prln(Object anyObject)
    {
        System.out.println(anyObject);
    }
    
    static void pr(Object anyObject)
    {
        System.out.println(anyObject);
    }
}
