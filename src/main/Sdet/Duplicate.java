package Sdet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Duplicate {
    public static void main(String[] args) {

//        String str = "Abhishek Sharma Is Working In Zest";
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//            if (currentChar == ' ') {
//                result.append(' ');
//            } else if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
//                result.append(currentChar);
//            } else {
//                result.append('@');
//            }
//        }
//
//        System.out.println("Modified string: " + result.toString());
//    }
//}


        //String s = "maddy";
        String s = "kamehamehal";
        char[] ch = s.toCharArray();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        for (Character chr : set) {
            int count = 0;
            for (int i = 0; i < ch.length; i++) {
                if (chr == ch[i]) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(chr);
            }
           // System.out.println("====================");
            //System.out.println(chr + " = " + count);
        }

    }
}