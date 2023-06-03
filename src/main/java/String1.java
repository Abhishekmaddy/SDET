package main.java;

public class String1 {
    public static void main(String[] args){
        String str = "Abhishek Sharma Working in Zest Money";
        char[] chaAr = str.toCharArray();

        //Approach1
        for (int i = chaAr.length -1 ; i>=0 ; i--){
            System.out.print(chaAr[i]);
        }
        System.out.println();



        //Approach2
        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

        //Approach3
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        //Approach4
        StringBuilder sbuilder = new StringBuilder(str);
        System.out.println(sbuilder.reverse());
    }
}
