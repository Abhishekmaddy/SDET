package main.abhi;

import java.util.HashMap;
import java.util.Map;

public class ReplaceDuplicates {
    public static void main(String[] args) {


        String str = "Abhishek Sharma Is Working In Zest";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ') {
                result.append(' ');
            } else if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                result.append(currentChar);
            } else {
                result.append('@');
            }
        }

        System.out.println("Modified string: " + result.toString());
    }
}


