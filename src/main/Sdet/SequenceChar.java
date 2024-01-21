package Sdet;

public class SequenceChar {


    public static void charSeq(){

        String s1= "lost";
        String s2 ="wild forest";

        String temp = "";

        for (int i = 0; i <= s2.length() - 1; i++) {
            for (int j = 0; j <= s1.length() - 1; j++) {
                if (String.valueOf(s2.charAt(i)).equals(String.valueOf(s1.charAt(j)))) {
                    temp = temp + String.valueOf(s2.charAt(i));
                }
            }
        }

        if (temp.equals(s1)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        SequenceChar.charSeq();
    }

}
