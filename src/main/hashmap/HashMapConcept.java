package main.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {

        Map<String, Integer> map1 =new HashMap<String, Integer>();
        map1.put("Abhi", 100);
        map1.put("Nandy", 200);



        Iterator<Map.Entry<String,Integer>> it = map1.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String , Integer> pair =it.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }



    }
}
