package XPackX;

public class SortNum {
    public static void main(String[] args) {
        String a="Rahul123S";

        System.out.println(a.replaceAll("[^a-z A-Z]",""));
        System.out.println(a.replaceAll("[^0-9]",""));

    }
}
