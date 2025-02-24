import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        //insertion
        map.put("KL","Kerala");
        map.put("TN","Tamilnadu");
        map.put("KA","Karnataka");
        //Search
        System.out.println(map.get("KL"));
        System.out.println(map.get("TN"));
        System.out.println(map.get("AG"));
        System.out.println(map.getOrDefault("AG","Not found")); 
        //remove
        map.remove("KL");
        
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        System.out.println(map.containsKey("AG"));
        System.out.println(map.containsValue("Kerala"));
        System.out.println(map.size());
        map.remove("KL");
        System.out.println(map.isEmpty());
        
     
    }
}
        
