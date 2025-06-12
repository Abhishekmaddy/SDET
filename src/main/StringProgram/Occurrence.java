package main.StringProgram;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Occurrence {
    public static void main(String[] args) {
        String s = "banana shaba";
        String str=s.replaceAll(" ","").toLowerCase();
        System.out.println(str);
        char[] ch = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        //LinkedList<Character> set = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(ch[i]);
        }
        for (Character chr : set) {
            int count = 0;
            for (int i = 0; i < ch.length; i++) {
                if (chr == ch[i]) {
                    count++;
                }
            }
            if (count>1 || count==1  ) {
                System.out.println(chr + " = " + count);
            }
        }
    }
}
