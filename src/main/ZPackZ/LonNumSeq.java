package ZPackZ;

import java.util.HashSet;

class LonNumSeq {
    public static void main(String[] args) {
        int arr[] = {3, 9, 1, 10, 4, 20, 2, 3};

        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr) {
            hs.add(num);
        }
        int longestLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int num = arr[i];
                while (hs.contains(num)) {
                    num++;
                }
                if (longestLength < arr[i] - 1) {
                    longestLength = arr[i];
                }
            }

        }
        System.out.print(longestLength);
    }
}
