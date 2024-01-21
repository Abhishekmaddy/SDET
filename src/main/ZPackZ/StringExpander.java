package ZPackZ;

public class
StringExpander {
    public static void main(String[] args) {
        String input = "a2b3c4";
        String output = expandString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    private static String expandString(String input) {
        String result = "";
        char currentChar = ' ';
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                currentChar = ch;
            } else if (Character.isDigit(ch)) {
                int repeatCount = Character.getNumericValue(ch);
                for (int i = 0; i < repeatCount; i++) {
                    result = result + currentChar;
                }
            }
        }
        return result;
    }
}