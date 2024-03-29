package main.abhi;

import java.util.ArrayList;
import java.util.List;

public class FizzBuss {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                fizz = 0;
                buzz = 0;
                list.add("FizzBuzz");
            } else if (fizz == 3) {
                fizz = 0;
                list.add("Fizz");
            } else if (buzz == 5) {
                buzz = 0;
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }
}
