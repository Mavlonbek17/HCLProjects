package MyPackage;

public class Test {
    public static void main(String[]args){
        Queque qu = new Queque();
        System.out.println(qu.front);
        System.out.println(qu.rear);

        qu.add("Hello");
        qu.add("Hello");
        qu.add("Hello");

        System.out.println(qu.front);
        System.out.println(qu.rear);

        System.out.println(qu.rear.PreviuesNode);
        System.out.println(qu.front.PreviuesNode);

        System.out.println(qu.front.value);
        System.out.println(qu.rear.value);

        System.out.println(qu.front.nextNode.value);
        System.out.println(qu.rear.PreviuesNode.value);

        qu.empty();
        System.out.println(qu.size());
        qu.iterator();






    }
}
