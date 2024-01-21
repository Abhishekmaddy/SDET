package Sdet;

public class specialChar {
    public static void main(String[] args) {

        String s ="%J#A&%V!#$A";
        String plainStr = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainStr);
    }
}
