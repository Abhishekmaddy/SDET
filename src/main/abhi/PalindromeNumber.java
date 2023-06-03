package main.abhi;

public class PalindromeNumber {
    public static void main(String[] args) {
//        int n = 141;
//        int r, sum = 0, temp;
//        temp= n;
//         while (n>0){
//            r= n%10;
//            sum =(sum*10) +r;
//            n=n/10;
//         }
//         if (temp==sum)
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");
//
//    }





        int num= 141;
        int r, sum=0,temp;
        temp=num;

        while (num>0){
            r=num%10;
            sum= (sum*10)+ r;
            num=num/10;
        }
        if (temp==sum){
            System.out.println("Palindrom number");
        }else {
            System.out.println("Not Palindrom");
        }

















    }



}
