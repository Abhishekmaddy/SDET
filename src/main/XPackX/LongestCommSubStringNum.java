package XPackX;

public class LongestCommSubStringNum {


    public static void main(String[] args) {
        String s1 = "xyzabcp";
        String s2 = "pqabcxy";
        int max = 0;

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                char c1 = s1.charAt(i - 1);
                char c2 = s1.charAt(j - 1);
                if (c1 != c2) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        System.out.print(max);

//            for(int i=1; i<dp.length; i++)
//            {
//                for(int j=1; j<dp.length; j++)
//
//                {
//                    String str =dp[i][j].getStringCellValue();
//                    String str1=str1+str;
//                    System.out.println(str1);
//                }
//            }
    }

}

