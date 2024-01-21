package XPackX;

public class SeprateDigitCharSpecial {
    public static void main(String[] args) {
        String s="23kkdr$#30f#@@dd859";
        char[] ch = s.toCharArray();
        String digit ="";
        String alfabet ="";
        String spclchar ="";

        for (int i=0; i<=ch.length-1;i++){
            if (Character.isDigit(ch[i])){
                digit = digit+ch[i];
            }else if (Character.isAlphabetic(ch[i])){
                alfabet = alfabet+ch[i];
            }else {
                spclchar =spclchar+ch[i];
            }
        }

        System.out.println(digit);
        System.out.println(alfabet);
        System.out.println(spclchar);



    }
}
