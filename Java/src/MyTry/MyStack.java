package MyTry;

import java.util.ArrayList;

public class MyStack {


    ArrayList<String>entries = new ArrayList<>();


    public MyStack(){


    }

    public String peek(){
        return entries.get(this.Size()-1);
    }


    public String pop(){
        String ret = entries.get(this.Size()-1);

        entries.remove(this.Size()-1);
        return ret;

    }

    public void push(String element){
        entries.add(element);


    }

    public int Size(){
        return entries.size();
    }
}
