package XPackX;

public class String2 {


    public static void main(String[] args) {
        String s = "Abhi";
        randomProgram(s);

    }
    public static void randomProgram(String str){

        String b ="";
        for (int i =0; i<=str.length()-1; i++){
            char ch=  str.charAt(i);
            b=b+ch;
            for (int j=0; j<=b.length()-1; j++){
                System.out.print(ch);
            }
        }
    }
}
