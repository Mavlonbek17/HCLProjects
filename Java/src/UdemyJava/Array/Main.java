package UdemyJava.Array;

import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    public static  void main(String[]args){
//        int[] myIntArray = new int[101];
////        myIntArray[5] = 50;
////        double[] myDoubleArray = new double[10];
////        System.out.println(myIntArray[5]);
//        for (int i = 0; i < myIntArray.length; i ++){
//            myIntArray[i] = i*10;
//
//        }
//        for (int i  = 0;i<myIntArray.length;i++){
//            System.out.println("element " +i+","+"value"+myIntArray[i]);
//        }

        int[] myIntegers = getIntegers(5);

        for (int i = 0; i < myIntegers.length;i++){
            System.out.println("Element "+ i + " typed values was" + myIntegers[i]);
        }

        System.out.println("The Avarage is "+ getAvarage(myIntegers));



    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number+" Integers Values. \r");
        int[]values = new int[number];

        for (int i = 0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static double getAvarage(int[]array){
        int sum =  0;
        for(int i = 0; i< array.length;i++){
            sum+=array[i];
        }
        return (double) sum/(double) array.length;
    }
}
