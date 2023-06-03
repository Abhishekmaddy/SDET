package main.StringProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcdab";
        char[] ch= str.toCharArray();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(ch[i]);
        }
        for (Character c : set){
            System.out.print(c);
        }







        //System.out.println(longest(str));
    }

//    public static String longest(String str) {
//
//        HashSet<Character> set = new HashSet<>();
//        String longestOverall = "";
//        String longestTillNow = "";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (set.contains(c)) {
//                longestTillNow = "";
//                set.clear();
//            }
//            set.add(c);
//            longestTillNow += c;
//            if (longestTillNow.length() > longestOverall.length()) {
//                longestOverall = longestTillNow;
//            }
//        }
//        return longestOverall;
//    }
}
