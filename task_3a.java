
package com.mycompany.universitytask;

import java.util.Scanner;
public class task_3a {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int [10];
        
        System.out.println("Enter 10 integer : ");
        for (int i=0;i<10 ;i++){
            arr[i]= scanner.nextInt();
        }
        
        System.out.println("Modified Array : ");
        for (int i=0;i<10;i++){
            if(arr[i]%2 == 0){
                arr[i]+=10;
            }
            else{
                arr[i]+=5;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
