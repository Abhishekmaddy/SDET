package XPackX;

public class TotalNumString {

    public static void main(String[] args) {


        String a = "The best of both worlds";
        int count = 0;

        //Counts each character except space
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }
}
