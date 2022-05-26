package MyTry;

public class LoopsProblems {
    public static void main(String[] args){
        String gender = "male";
//        if(gender =="male"){
//            System.out.println("True");
//        }else if(gender == "female"){
//            System.out.println("False");
//
//        }else{
//            System.out.println("bored");
//        }

        switch(gender){
            case "male":
                System.out.println("Male");
                break;
            case "female":
                System.out.println("Female");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
