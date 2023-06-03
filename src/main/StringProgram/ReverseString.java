package main.StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseString {
    public static void main(String[] args) {
        String s= "Abhishek";
        char[] ch =s.toCharArray();

        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
//
//        //Remove Duplicate
//        Set<Character> set = new LinkedHashSet<>();
//        for (int i=0;i<ch.length;i++){
//            set.add(ch[i]);
//        }
//        for (Character s1 : set){
//            System.out.print(s1);
//        }
    }
}
