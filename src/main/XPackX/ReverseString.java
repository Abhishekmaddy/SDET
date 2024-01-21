package XPackX;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Abhishek";
        char[] ch = str.trim().toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
