package UdemyJava.AutoBoxingUnboXing;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        Integer myIntValue = 56;//Integer .valueOf()
        int myInt = myIntValue.intValue();//myInteValue.intValue;




        ArrayList<String>myString = new ArrayList<String>();
        for(int i = 0;i<10;i++){
            myString.add("Hello");
        }

        for(int i =0;i<myString.size();i++){
            String s = myString.get(i);
            System.out.println(i+" "+s);
        }













//
//        Integer i = new Integer(10);
//
//        // Unboxing the Object
//        int i1 = i;
//
//        // Print statements
//        System.out.println("Value of i:" + i);
//        System.out.println("Value of i1: " + i1);
//
//        // Autoboxing of character
//        Character gfg = 'a';
//
//        // Auto-unboxing of Character
//        char ch = gfg;
//
//        // Print statements
//        System.out.println("Value of ch: " + ch);
//        System.out.println(" Value of gfg: " + gfg);

    }
}
