package main.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Compare {
    public static void main(String[] args) {

        HashMap<String, String > city1 = new HashMap<>();
        city1.put("UP", "Allahabad");
        city1.put("MP", "Bhopal");
        city1.put("DL", "GG");

        HashMap<String, String > city2 = new HashMap<>();
        city2.put("UP", "Allahabad");
        city2.put("MP", "Bhopal");
        city2.put("DL", "GG");
        city2.put("UK", "Nainital");


        //compare hashmaps and find out extra key in hashmaps

        HashSet<String> compareKey = new HashSet<>(city1.keySet());
        System.out.println(compareKey);
        compareKey.addAll(city2.keySet());
        compareKey.removeAll(city1.keySet());
        System.out.println(compareKey);
    }


}
