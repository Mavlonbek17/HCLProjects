package MyTry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[]args){

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name","Some");
        hashMap.put("adress","Ind");
        hashMap.put("some","Thing");

        hashMap.get("name");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key:"+key + "| value:" + value);
        }


        ArrayList<String>myarrasy = new ArrayList<>();
        myarrasy.add("Hello");
        myarrasy.add("How are you");

        myarrasy.size();

        for(String q:myarrasy){
            System.out.println(q);
        }


    }
}
