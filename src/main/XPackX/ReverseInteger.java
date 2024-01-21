package XPackX;

public class ReverseInteger {

    public static void main(String[] args) {

        int num =123456;
        String s =Integer.toString(num);

        for (int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
