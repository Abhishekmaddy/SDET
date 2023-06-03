package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class validAnagram {
    public static void main(String[] args) {

        String s1 = "anagram";
        String s2 = "gramana";


        ArrayList<Character> ch1 = new ArrayList<>();
        ArrayList<Character> ch2 = new ArrayList<>();

        for(int i =0; i<s1.length(); i++){
            ch1.add(s1.charAt(i));
        }
        for(int i =0; i<s2.length(); i++){
            ch2.add(s2.charAt(i));
        }
        Collections.sort(ch1);
        Collections.sort(ch2);
        if(ch1.equals(ch2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

