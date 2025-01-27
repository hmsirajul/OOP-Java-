/*
 * Print array index values 1 to 100;
 */
package com.mycompany.lessons;

public class Array_index_Value {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int i=100;
        while(i>0){
            arr[i-1] =(i-1);
            i--;
        }
        while(i<100){
            prln("Arr["+i+"] :" +arr[i]);
            i++;
        }
        
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
