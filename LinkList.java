
package com.mycompany.lessons;
import java.util.LinkedList;
public class LinkList {
    public static void main (String [] args)
    {
        
       LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("F");
        ll.add("G");
        ll.add("H");
        ll.add("K");
        ll.add("L");
        ll.addLast("Z");         
        ll.addFirst("A."); 
        
        // direct importing value useing functions;
        ll.add(1, "A2");
        //printing value using index number;

        System.out.println("Value : " + ll.get(0)); 
        //Another way to remove 

        ll.remove("F"); 
        //Another way to remove 
         ll.remove(2);         
       // ll.removeFirst();     
       // ll.removeLast();     
       
       // Another way to importing value useing functions;

        String val = ll.get(2);  
        ll.set(2, val + "ch");   

       System.out.println("Value : " + ll); 
    }
    
}
