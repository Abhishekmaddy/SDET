package ZPackZ;

public class PalindromNum {

    public static void main(String[] args) {

        int n,r,temp,sum=0;
        n=41;
        temp=n;
        while(n!=0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }if (temp==sum){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
