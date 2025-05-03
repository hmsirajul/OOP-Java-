
package com.mycompany.lessons;

import java.util.ArrayList;
public class ArrayList {
    public static void main(String [] args){
    ArrayList<Integer> al = new ArrayList<Integer>();

        // ✅ কিছু integer ভ্যালু যোগ করছি
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // ✅ ArrayList প্রিন্ট
        System.out.println("Contents : " + al);

        // ✅ ArrayList থেকে Array তে রূপান্তর
        Integer[] in = new Integer[al.size()];
        in = al.toArray(in);  // toArray() method দিয়ে array তে রূপান্তর

        // ✅ Array এর উপাদান গুলো যোগফল করা
        int sum = 0;
        for (int i : in) {
            sum += i;
        }

        // ✅ যোগফল প্রিন্ট
        System.out.println("Sum : " + sum);
           
        
    }
}
