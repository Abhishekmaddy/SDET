package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {


        //1. LinkedHashSet
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,3,21,4,1,1,24,56,6,7));
        System.out.println(list);

        LinkedHashSet<Integer> marks = new LinkedHashSet<>(list);

        ArrayList<Integer> unique = new ArrayList<Integer>(marks);
        System.out.println(unique);


        //2. Streams
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,3,21,4,1,1,24,56,6,7));
        List<Integer> finalmarks = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(finalmarks);





    }
}
