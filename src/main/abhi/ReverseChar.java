package main.abhi;

public class ReverseChar {
    public static void main(String[] args) {
        String str = "java is programing language";
        String[] word = str.split(" ");
        String strrev = "";
        for (String w : word) {
            String rev = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                rev = rev + w.charAt(i);
            }
            strrev = strrev + rev + " ";
        }
        System.out.println(strrev);
    }


//        String str = "java is a programming language";
//        String[] word = str.split(" ");
//        String strrev = "";
//        for (String w : word) {
//            String rev = "";
//            for (int i = w.length() - 1; i >= 0; i--) {
//                rev = rev + w.charAt(i);
//            }
//            strrev = strrev + rev + " ";
//        }
//        System.out.println(strrev);
//    }

}
