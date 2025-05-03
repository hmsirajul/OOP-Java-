
package com.mycompany.lessons;
import java.util.*;
public class USR_DException {
    public static void main(String arges[]){
 try {
            throw new NewException(5);  
        } catch (NewException ex) {     
            System.out.println(ex);     
        }
    }

   
    static class NewException extends Exception {
        int a;

        NewException(int b) {
            a = b;
        }

        public String toString() {
            return "Exception value = " + a;
        }
    }
    
    
}
