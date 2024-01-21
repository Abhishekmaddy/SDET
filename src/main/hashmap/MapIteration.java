package main.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        //HashMap<String, String> map = new HashMap(Map.of("Abhishek", "Sharma","Nandita", "Rao"));
        Map<String, Integer> map = new HashMap<>();
        map.put("Abhishek", 1);
        map.put("Nandita", 2);


        //using foreach
       // map.forEach((n, r) -> System.out.println("Name : " + n + ", Rank: " + r));
        map.forEach((n,r) -> System.out.println("Name : " +n+ ",  " +r));
//
//
//        //using iterator
//        HashMap<String, String> map1 = new HashMap<>();
//        map1.put("Abhishek", "Sharma");
//        map1.put("Nandita", "Rao");
//
//        Iterator<Map.Entry<String, String>> it = map1.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> pair = it.next();
//            System.out.println("Name :" + pair.getKey() + "," + "Surname : " + pair.getValue());
//        }



//        for (Map.Entry<String, Integer> entry : map.entrySet() ){
//         String key =entry.getKey();
//         int value = entry.getValue();
//            System.out.println("Name : " +key + " |  Age : " +value);
//        }
//          find out extra key
//        HashSet<String> set = new HashSet<>(map.keySet());
//
//        set.addAll(map1.keySet());
//        set.removeAll(map.keySet());
//        System.out.println(set);

    }
}
