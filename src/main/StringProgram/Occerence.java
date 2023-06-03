package main.StringProgram;

import java.util.LinkedHashSet;

public class Occerence {
    public static void main(String[] args) {
        String str = "banana";
        char[] ch = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
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
            if (count==1) {
                System.out.println(chr + " = " + count);
            }
        }
    }
}
