package UdemyJava.Polymorphism;


public class Main {


    public static void main(String[]args){

        for (int i  = 1; i<5;i++){
            Car newcar = randomCar();
            System.out.println("Car #"+i+":"+"Car Name: "+newcar.getName()+": Car voice "+newcar.Voice());
        }


    }
    public static Car randomCar(){

        int randomNumber = (int)(Math.random()*2)+1;
        System.out.println("Random number was: "+randomNumber);
        switch (randomNumber){
            case 1:
                return new BMW();
            case 2:
                return new Supra();
            default:
                return null;
        }
    }

}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    public String Voice(){
        return "Has no Voice";
    }

    public String getName() {
        return name;
    }
}

class BMW extends Car{
    public BMW() {
        super("BMW");
    }

    @Override
    public String Voice() {
        return "GGGGGGGIIIIIIINNNN";
    }
}

class Supra extends  Car{
    public Supra() {
        super("Supra");
    }

    @Override
    public String Voice() {
        return "StuStuStuuu";
    }
}




