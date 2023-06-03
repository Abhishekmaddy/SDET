package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComapre {
    public static void main(String[] args) {

        //1. sort and then Compare


        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C","E","F"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A","B","C","E","E"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("B","A","C","E","F"));

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1.equals(list2));

        Collections.sort(list3);
        System.out.println(list1.equals(list3));

        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("A","B","C","E","F"));
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("A","B","C","E",""));


    }
}
