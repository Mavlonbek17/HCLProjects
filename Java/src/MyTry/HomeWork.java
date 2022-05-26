package MyTry;

public class HomeWork {
    static int myNumber = 13456;
    public static void main(String[] args) throws InterruptedException {
        PrintOdd printOdd = new PrintOdd();
        PrintEven printEven = new PrintEven();
        printOdd.start();
        printEven.start();
    }

    static class PrintOdd extends Thread {
        public void run() {
            if( myNumber%2 == 1  ){
                System.out.println(myNumber+" not even ");
            }
        }
    }
    static class PrintEven extends Thread {
        public void run() {
            if( myNumber%2 == 0  ){
                System.out.println(myNumber+" is even ");
            }
        }
    }

    /// Thread  ==
    // Synchronized Thread ==
    // non synchronized  Thread ==
    // sleep  and wait
    // Runnable interface
    // ---> Main Odd==> PrintOdd => wait ==> awake ==> PrintEven ==> Print ==> wait ==> awake => odd ==>
    // Thread-safe /
    //


}
