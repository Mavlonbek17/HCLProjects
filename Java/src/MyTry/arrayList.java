package MyTry;

public class arrayList {
    public static void main(String[]args){
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Mavlonbek");
//        list.add("Gap");
//        list.add("Jack");
//        list.size();
//
//        for(int i  = 0; i < list.size();i++){
//            String a = list.get(i);
//            System.out.println(a);
//        }
//
//        System.out.println("-----------------------------------------------");
////        Iterator<String> iterator = list.iterator();
////        while(iterator.hasNext()){
////
////            System.out.println(iterator.next());
////
////        }
//
//        for (String q : list) {
//            System.out.println(q);
//        }

        MyStack my = new MyStack();
        my.push("Helo");
        my.push("He");
        my.push("Hlo");

        System.out.println(my.peek());
        my.pop();

        System.out.println(my.peek());
        my.pop();
        System.out.println(my.peek());



    }



}
