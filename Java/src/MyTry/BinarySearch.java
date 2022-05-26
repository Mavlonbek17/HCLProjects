package MyTry;

public class BinarySearch {
    public static void main(String[] args) {
        char myunicode = '\u0AB8';
        System.out.println(myunicode);
        int arr[] = {6, 34, 3443, 434,65, 35, 67, 3999};
        int toBeFound = 65;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toBeFound) {
                System.out.println("Element " + toBeFound + " is present at index: " + i);
                return;
            }
        }
    }


}
