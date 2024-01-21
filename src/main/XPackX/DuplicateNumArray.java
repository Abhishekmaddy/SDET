package XPackX;

import io.cucumber.java.hu.Ha;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateNumArray {

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 5, 1, 6, 3, 5};

//        //create HashSet to Store unique number
//        HashSet<Integer>  uniqueNumber = new HashSet<>();
//
//        //create HashSet to Store Duplicate Number
//        HashSet<Integer> duplicateNumber = new HashSet<>();
//
//        //Iterate through Array
//        for (Integer num : arr){
//            if (!uniqueNumber.add(num)){ //
//                duplicateNumber.add(num);
//            }
//        }
//        System.out.println("Duplicate Number :" +duplicateNumber);
//
//    }


        int[] ab = {1,2,3,4,5,1,2,-9,-9};
        int count = 0;
        for (int i = 0; i < ab.length; i++) {
            count = 1;
            for (int j = i + 1; j < ab.length; j++) {
                if (ab[i] == ab[j]) {
                    count++;
                    //ab[j] = '0';

                }
            }
            if (count > 1) {
                System.out.print(ab[i] + " ");
            }
        }

    }

}
