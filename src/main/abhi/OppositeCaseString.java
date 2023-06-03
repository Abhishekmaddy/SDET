package main.abhi;

public class OppositeCaseString {
    public static void main(String[] args) {
        String input = "Abhishek Sharma Working in ZestMoney";
        String output = getOppositeCaseString(input);
        System.out.println(output);
    }
    private static String getOppositeCaseString(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

