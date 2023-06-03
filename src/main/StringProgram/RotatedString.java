package main.StringProgram;

public class RotatedString {
    public static void main(String[] args) {
        System.out.println(isRotatedString("abcd","bcdb"));
    }

    public static boolean isRotatedString(String str, String rotatedString) {

        boolean isRotatedString = false;
        if (str == null || rotatedString == null) {
            return false;

        } else if (str.length() != rotatedString.length()) {
            return false;
        } else {
            String concatenated = str+str;
            return concatenated.contains(rotatedString);
        }

    }
}

