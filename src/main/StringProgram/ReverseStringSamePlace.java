package main.StringProgram;

public class ReverseStringSamePlace {
    public static void main(String[] args) {
        String str = "My name is abhishek sharma";
        String [] word = str.split(" ");
        String strrev="";
        for (String w : word){
            String rev ="";
           for (int i=w.length()-1; i>=0;i--){
             rev = rev +w.charAt(i);
           }
            strrev = strrev + rev + " ";
        }
        System.out.println(strrev);
    }
}
