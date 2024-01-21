package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {


//        //1. LinkedHashSet
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,3,21,4,1,1,24,56,6,7));
//        System.out.println(list);
//
//        LinkedHashSet<Integer> marks = new LinkedHashSet<>(list);
//
//        ArrayList<Integer> unique = new ArrayList<Integer>(marks);
//        System.out.println(unique);
//
//
//        //2. Streams
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,3,21,4,1,1,24,56,6,7));
//        List<Integer> finalmarks = list2.stream().distinct().collect(Collectors.toList());
//        System.out.println(finalmarks);


        int []ab={1,2,3,1,2,3,5,56};
        int count=0;
        for(int i=0;i<ab.length;i++)
        {
            count=1;
            for(int j=i+1;j<ab.length;j++)
            {
                if(ab[i]==ab[j] && ab[i]!=' ')
                {
                    count++;
                    ab[j]='0';

                }
            }

            if(count>1 && ab[i]!='0')
            {
                System.out.println(ab[i]+" ");
            }
        }





    }
}
