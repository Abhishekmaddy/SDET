package main.abhi;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "kanakp";
        char[] str = s.toCharArray();
        String rev = "";

        for (int i = str.length-1; i>=0; i--){
             rev = rev + str[i];
        }
        if (rev.equals(s))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
