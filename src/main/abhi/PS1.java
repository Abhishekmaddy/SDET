package main.abhi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PS1 {

        public static void main(String[] args) {

            String input = "Abhishek Sharma Is Working In Zest Money";

            String replacedString = replaceDuplicatesWithSymbol(input, '@');

            System.out.println(replacedString);

        }



        public static String replaceDuplicatesWithSymbol(String input, char symbol) {

            StringBuilder stringBuilder = new StringBuilder();

            Set<Character> seenCharacters = new HashSet<>();



            for (char c : input.toCharArray()) {

                if (!seenCharacters.contains(c)) {

                    stringBuilder.append(c);

                    seenCharacters.add(c);

                } else {

                    stringBuilder.append(symbol);

                }

            }



            return stringBuilder.toString();

        }

    }


