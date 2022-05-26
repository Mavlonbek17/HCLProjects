package MyPackage;

public class Queque{ //Generic data types
    class Node{
        String value;
        Node PreviuesNode;
        Node nextNode;


        public Node(String v){
            this.value = v;
        }

        public Node(String v,Node nextnode,Node preNode){
            this.value = v;
            this.nextNode = nextnode;
            this.PreviuesNode = preNode;
        }


    }

    //Inside queque


    Node front;
    Node rear;

    int size = 0;

    public void add(String s){
        if(front == null && rear == null){
            Node node = new Node(s);
            this.front = node;
            this.rear = node;

        }else{
            Node node = new Node(s,null,this.rear);
            this.rear.nextNode = node;
            this.rear = node;
        }
        size++;

     }


    public String remove(){
        size--;
        String removed_item = this.front.value;
        this.front = this.front.nextNode;
        this.front.PreviuesNode = null;
        System.out.println("Removed Item is "+removed_item);
        return removed_item;
    }

    public  void empty(){
        if(front == null && rear == null ){
            System.out.println("The List is empty");
        }else{
            System.out.println("Que has Elements");
        }
    }

    public void iterator(){
        Node last = this.front;
        while (last != null){
            System.out.println(last.value);
            last = last.nextNode;
        }
    }

    public boolean isExisting(String search){
        Node node = this.front;
        while (node != null)
        {
            if (node.value == search){
                return true;
            }
            node = node.nextNode;
        }
        return false;
    }




    public int size(){
        return size;
    }

     public Node getFront(){
        return this.front;
    }

    public Node getRear(){
        return this.rear;
    }





}
