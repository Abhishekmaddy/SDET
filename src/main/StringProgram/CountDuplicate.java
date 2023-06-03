package main.StringProgram;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class CountDuplicate {
    public static void main(String[] args) {

        String str = "Abhishek";
        char[] ch = str.toCharArray();

        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}