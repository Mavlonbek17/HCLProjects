package UdemyJava.Compositions;

public class Main {
    public static void main(String[]args){
        Dimesions dimensons = new Dimesions(20,20,5);

        Case theCase = new Case("220B","Dell","240",dimensons);

        Monitor theMonitor = new Monitor("27Inch Beast","Acer",27,new Resolution(2540,1440));

        Motherboard thMotherboard = new Motherboard("BJ-20","Asus",4,6,"v2.44");



        PC thePc = new PC(theCase,theMonitor,thMotherboard);
        thePc.getMonitor().drawPixwlat(1500,1200," red");
        thePc.getMotherboard().loadProgram("Windows 1.0");
        thePc.getThecase().pressPowerButton();

    }


}
