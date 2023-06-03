package main.abhi;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "Abhishek Sharma";
        char [] str =s1.toCharArray();
        for (int i=s1.length()-1; i>=0; i--){
            System.out.print(str[i]);
        }
    }
}
