package main.java;

import java.util.LinkedHashSet;

public class duplicateChar {
    public static void main(String[] args) {

        //String str = "aabbccdd";
        String str = "Abhishek Sharma Is Working In Zest Moeny";

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character ch : set) {
            System.out.print(ch);
        }
        //set.forEach(character -> System.out.print(character));

    }
}
