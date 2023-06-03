package main.abhi;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s ="abcbaa";
        char[] ch = s.trim().toCharArray();

        Set<Character> set = new LinkedHashSet<Character>();
        for (int i=0; i<ch.length;i++){
            set.add(ch[i]);
        }
        for (Character s1 : set){
            System.out.print(s1);
        }
    }
}
