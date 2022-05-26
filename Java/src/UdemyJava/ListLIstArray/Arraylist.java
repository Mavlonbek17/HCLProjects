package UdemyJava.ListLIstArray;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    //The difference between a built-in array and an
    // ArrayList in Java, is that the size of an array
    // cannot be modified (if you want to add or remove elements to/from
    // an array, you have to create a new one).While elements can be added and removed from an
    // ArrayList whenever you want. The syntax is also slightly different:

    public static void main(String[]args){
        ArrayList<String>cars = new ArrayList<String>();//Created arrayList Object
        cars.add("Volvo");//ArrayList.add() -> add items to theArrayList
        cars.add("BMW");
        cars.add("FORD");


        //Loop Throught the given array
        System.out.println("Below is For Loop");
        for (int i = 0; i<  cars.size();i++){
            System.out.println(cars.get(i));
        }


        //You can also loop through an ArrayList with the for-each loop:
        System.out.println("Below is For Each Loop \n");
        for (String i:cars)
        {
            System.out.println(i);
        }



        //ArrayList.Get -> get items from the arraylist
        System.out.println(cars.get(2)+"\n");




        //Change the Item using set()
        System.out.println(cars.set(0,"OPEl"));
        System.out.println(cars);




        //Remove the item inside the ArrayList
        System.out.println(cars.remove(2));
        System.out.println(cars);

        //To Get the size of an array use size();

        System.out.println(cars.size());

















        //To Clear everything inside the ArrayList
        cars.clear();
        System.out.println(cars+ " String ArrayList finished \n");


        System.out.println("Integar ArayList Started");

        ArrayList<Integer> myIntArray = new ArrayList<Integer>();
        myIntArray.add(12);
        myIntArray.add(23);
        myIntArray.add(45);
        myIntArray.add(1);
        myIntArray.add(67);
        myIntArray.add(65);

        System.out.println(" \n ForEach loop Started Started ");


        for (int i:myIntArray
             ) {
            System.out.println(i);

        }
        System.out.println("For Loop Started");
        for (int i  = 0; i< myIntArray.size();i++){
            System.out.println(myIntArray.get(i));
        }
        Collections.sort(myIntArray);
        System.out.println("\n Sorted Array Started \n");
        for (int i:myIntArray
             ) {
            System.out.println(i);

        }


    }
}
