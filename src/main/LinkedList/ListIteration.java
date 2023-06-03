package main.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListIteration {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 6, 7));
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

        //Using for Loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //using foreach loop
        for (Integer e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
        //using lambda expression
        list.forEach((e) -> System.out.print(e + " "));

        System.out.println();
        //using iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.print(n + " ");
        }

    }
}



