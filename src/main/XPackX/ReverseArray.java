package XPackX;

import java.util.*;

public class ReverseArray {

        public static void main(String[] args) {
            // Create a HashMap
            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Alice", 25);
            hashMap.put("Bob", 30);
            hashMap.put("Charlie", 22);

//            for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
//                System.out.println("key : " + entry.getKey() + " | value : " + entry.getValue());
//            }

            for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
                System.out.println(entry.getKey()+ " " +entry.getValue());
            }




















            // Alternatively, using while loop
//            Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
//            while (iterator.hasNext()) {
//                Map.Entry<String, Integer> entry = iterator.next();
//                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//            }
//
//            System.out.println("=======================================");
//
//            // Iterate through the keys using keySet()
//            for (String key : hashMap.keySet()) {
//                System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
//            }
//
//            System.out.println("=======================================");
//
//
//            // Iterate through the entries using entrySet()
//            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
//                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//            }
        }
    }


//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5,6};
//
//        for (int i=arr.length-1; i>=0;i--) {
//            System.out.print(arr[i]);
//        }
//    }
//
//}
