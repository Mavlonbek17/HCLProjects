package UdemyJava.ListLIstArray;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static int[]basedata = new int[10];

    public static void main(String[]args){

        System.out.println("Enter 10 Digits");
        getInput();
        printArray(basedata);
        resizeArray();
        System.out.println("Enter 15 Digits");
        getInput();
        printArray(basedata);

    }

    private static void getInput(){
        for(int i = 0;i< basedata.length;i++){
            basedata[i] = s.nextInt();
        }

    }
    private static void printArray(int[]array){
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }

    private static void resizeArray(){
        int[] original  = basedata;
        basedata =new int [15];
        for (int i = 0; i< original.length;i++){
            basedata[i] = original[i];
        }
    }

}
