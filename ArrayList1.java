
package com.mycompany.lessons;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
  
        System.out.println("Item at index 2: " + list.get(2)); // Cherry     
        list.remove("Date"); 
        // list.remove(1); 
        
        list.add(1, "Blueberry");

        //using set for imput another way set value without replacements;
         String val = list.get(2);
         list.set(2, val + "-ch");

        System.out.println("\nFinal List with Index:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + " - " + list.get(i));
        }
    }
}

