package main.Leet;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ReverseString {


    public static void main(String[] args) {
//        String str = "Hello world";
//        String str2 = "  Hello    Abhise  hk   ";
//        String str3 = "My Name Is Is Abhi My";
//        String str4 = "AbhiShe!@#$%^&*{]{}k";
//        String str5 = "My Name is Abhishek";  //MNiA
//        String str6 = "abc";
//        reverse(str);
//        revWholeSentence(str);
//        System.out.println(removeWhiteSpace(str2));
//        removeDuplicateWord(str3);
//        removeSpecialChar(str4);
//        returnFirstChar(str5);
//        subString(str6);
//        int [] num =  {1,2,43,3,144,12,1};
//        repeatElement(num);
//        int[] arr = {5, 43, 5, 6, 85};
//        findMaxMinDiff(arr);
//        int[] nums = {1, 2, 3, 4, 2, 1};
//        int firstUnique = findFirstUnique(nums);
//        System.out.println(firstUnique);
//        printDuplicteNum(nums);
        String str = "Abhishek";
        printVowels(str);
    }

    private static void reverse(String str) {

        String[] word = str.split(" ");
        String revstr = "";
        for (String s : word) {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }
            revstr += rev + " ";
        }
        System.out.println(revstr);
    }

    private static void revWholeSentence(String str) {

        String[] w = str.split(" ");
        for (int i = w.length - 1; i >= 0; i--) {

            System.out.print(w[i] + " ");
        }
    }

    private static String removeWhiteSpace(String str2) {

        String newstr = str2.replaceAll(" ", "");
        return newstr;
    }

    private static void removeDuplicateWord(String str3) {

        String[] word = str3.trim().split(" ");
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < word.length; i++) {
            set.add(word[i] + " ");
        }
        for (String s : set) {
            System.out.print(s);
        }
    }

    private static void removeSpecialChar(String str4) {

        String newstr = str4.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(newstr);
    }

    private static void returnFirstChar(String str5) {

        String word = "";
        String[] s = str5.split(" ");
        for (int i = 0; i < s.length; i++) {
            word = s[i];
            System.out.print(word.charAt(0));
        }
    }

    private static void subString(String str6) {

        for (int i = 0; i < str6.length(); i++) {
            for (int j = i + 1; j <= str6.length(); j++) {
                System.out.println(str6.substring(i, j));
            }
        }
    }

    private static void repeatElement(int[] num) {

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                    System.out.println("Numner = " + num[j] + " :  count = " + count);
                }
            }
        }
    }


    private static void findMaxMinDiff(int[] arr) {

        int temp, min, max, diff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }


    public static int findFirstUnique(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each number in the array
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        // Find the first unique number in the array
        for (int num : nums) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        return -1; // Return -1 if no unique number found
    }

    private static void printDuplicteNum(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            if (value == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], value + 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }


    private static void printVowels(String str) {

        String[] stringArray = str.split(" ");
        int wordCount = stringArray.length;
        System.out.println(wordCount);

        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                vowelCount++;
            }

        }
        System.out.println("Vowel count is: " + vowelCount);


        try {

        }finally {

        }
    }



}
