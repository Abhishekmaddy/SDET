package main.Leet;

import java.util.LinkedHashSet;

public class DuplicateArrayHave {

    public boolean containsDuplicate(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) return true;
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 3, 4, 5, 6};
        DuplicateArrayHave ds = new DuplicateArrayHave();
        boolean hasDuplicate = ds.containsDuplicate(arr);
        System.out.println(hasDuplicate);


    }






//    public static void main(String[] args) {
//        int[] arr = new int[]{2, 3,3,4,5,6};
//
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr.equals(arr[i])) {
//                System.out.println("False");
//                set.add(arr[i]);
//            }
//        }
//    }

}
