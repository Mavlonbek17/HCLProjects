package MyTry;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MyTry {
    public static void main(String[] args) {

        HashMap<Integer,Student> st = new HashMap<Integer, Student>();
        for(int i  = 0; i< 100; i++){
            st.put(i,getStudent());
        }
//        for(int i = 0; i< st.size();i++){
//            System.out.println(st.get(i).name);
//        }


        Stream stream1 = st.entrySet().stream();
        stream1.filter(o -> {
            Student student = ((Student) ((Map.Entry)o).getValue());
            if(student.score > 50){
                return true;
            }else{
                return  false;
            }


        }

        ).forEach(o -> {
            Student student = ((Student) ((Map.Entry) o).getValue());
                    System.out.println(student.score+" "+student.name);
        }
        );



    }



    public static Student getStudent(){
        String ch = "abcdefghijklmnopqrstuvwxyz";
        String name = "";
        for (int i = 0 ; i < 6; i++){
            name = name + ch.charAt((int)(1+ Math.random()*24));
        }
        Long rollNumber = Student.myRoolls++;
        int score = (int)(0+ Math.random()*100);

        if(score == 0){
            return new Student(name, rollNumber);
        } else {
            return new Student(name, rollNumber, score);
        }
    }
}



class Student{
    public static Long myRoolls = 0L;
    String name;
    Long rollNumber;
    int score;
    Student( String name, Long rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    Student( String name, Long rollNumber , int score){
        this.name = name;
        this.rollNumber = rollNumber;
        this.score = score;
    }
}

/////// 1. all students with more than 50%
/////// 2. Top 3 Students  with score
/////// 3. Students who did not appear for exam
//////  4. last 10% of student score
//////  5. find 85th percentile


