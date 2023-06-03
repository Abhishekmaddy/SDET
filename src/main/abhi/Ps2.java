package main.abhi;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Ps2 {
    public static void main(String[] args) {
        String s = "maddy";
        char[] word = s.toCharArray();

        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < word.length; i++) {
            set.add(word[i]);
        }
        for (Character ch : set) {
            int count=0;
            for (int i =0; i<word.length;i++){
                if (ch==word[i]){
                    count++;
                }
            }
            System.out.println(ch+ " = " +count);
        }
    }
}
