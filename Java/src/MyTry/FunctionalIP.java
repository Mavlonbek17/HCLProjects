package MyTry;

import java.util.stream.Stream;

public class FunctionalIP {
    public static void main(String[] args) {

//        myStatic("satty");

//        Integer[] array = new Integer[]{ 232,23,23,23,2325646,456,4,0,9,9789,89,789,789,78978,2,5,7,7 };
//        Stream stream = Stream.of(array);
//
//        stream
//                .filter( i ->  (Integer)i < 6)
//                .forEach( Average::myStatic );

//
        String[] arrayName = new String[]{  "fgd" , "werer" };
        String[] arrayName1 = new String[]{  "fgdscffc"  };

        Stream streamNames = Stream.of(arrayName);
        Stream streamNames1 = Stream.of(arrayName1);

        System.out.println(streamNames.findAny());

        Stream.concat(streamNames , streamNames1).forEach( System.out::println);

//
    }


}
