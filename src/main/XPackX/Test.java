package XPackX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class Test {


//        public static int findLongestCommonSubstring(String str1, String str2) {
//            int m = str1.length();
//            int n = str2.length();
//
//            int[][] dp = new int[m + 1][n + 1];
//            int maxLength = 0;
//
//            for (int i = 1; i <= m; i++) {
//                for (int j = 1; j <= n; j++) {
//                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
//                        dp[i][j] = dp[i - 1][j - 1] + 1;
//                        maxLength = Math.max(maxLength, dp[i][j]);
//                    } else {
//                        dp[i][j] = 0;  // reset the length if characters don't match
//                    }
//                }
//            }
//
//            return maxLength;
//        }

//        public static void main(String[] args) {
//            String str1 = "abcdef";
//            String str2 = "zabcde";
//
//            int longestCommonSubstringLength = findLongestCommonSubstring(str1, str2);
//
//            System.out.println("Length of the Longest Common Substring: " + longestCommonSubstringLength);
//        }
//    }

    public static String findLongestCommonSubstring(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;  // update the end index of the longest common substring
                    }
                } else {
                    dp[i][j] = 0;  // reset the length if characters don't match
                }
            }
        }

        if (maxLength == 0) {
            return "";  // no common substring found
        } else {
            return str1.substring(endIndex - maxLength + 1, endIndex + 1);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "zabcde";

        String longestCommonSubstring = findLongestCommonSubstring(str1, str2);

        System.out.println("Longest Common Substring: " + longestCommonSubstring);
    }
}



