package main.abhi;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {
    //        public static void main(String[] args) {
//        String s ="Rahul Ravindra Sonar";
//        char[] ch = s.trim().toCharArray();
//            System.out.println(ch);
//
//        Set<Character> set = new LinkedHashSet<Character>();
//        for (int i=0; i<ch.length;i++){
//            set.add(ch[i]);
//        }
//        for (Character s1 : set){
//            System.out.print(s1);
//        }
//    }
    public static void main(String[] args) {

        int[] ab = {1, 2, 3, 1, 2, 3, 5, 56};
        int count = 0;
        for (int i = 0; i < ab.length; i++) {
            count = 1;
            for (int j = i + 1; j < ab.length; j++) {
                if (ab[i] == ab[j] && ab[i] != ' ') {
                    count++;
                    ab[j] = '0';

                }
            }

            if (count > 1 && ab[i] != '0') {
                System.out.println(ab[i] + " ");
            }
        }
    }
}

//    public static void main(String[] args) {
//        String a = "Rahul Ravindra Sonar";
//        char[] ab = a.trim().toCharArray();
//        int count = 0;
//        for (int i = 0; i <= ab.length - 1; i++) {
//            count = 1;
//            for (int j = i + 1; j <= ab.length - 1; j++) {
//                if (ab[i] == ab[j]) {
//                    count++;
//                    //ab[j] = '0';
//                    break;
//                }
//            }
//
//            if (count > 1) {
//                System.out.print(ab[i]);
//            }
//        }
//    }


