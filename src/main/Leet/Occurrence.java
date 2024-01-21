package main.Leet;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,2,1,3};
        findDuplicateNumber(arr);
    }
    private static void findDuplicateNumber(int [] arr){


        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            Integer mapValue= map.get(arr[i]);
              // map.put();
            }
        }



    }


