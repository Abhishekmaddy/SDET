package main.XPackX;


public class VowelAndConsonunt {

    public static void main(String[] args) {
        String sb = "Abhishek Sharma";
        stringVoCo(sb);
    }
    public  static void stringVoCo(String str){
        int vo = 0;
        int conso = 0;

        String s1 =str.toLowerCase();
        for (int i =0 ; i<=s1.length()-1; i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                vo++;
            }else if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                conso++;

            }
        }
        System.out.println(vo);
        System.out.println(conso);
    }

}
