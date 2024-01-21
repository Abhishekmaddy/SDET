package XPackX;

import java.util.Locale;

public class RemoveDupCharInString {
    public static void main(String[] args) {

        String s = "Abhishek Sharma";
        String s1=s.toLowerCase();
        char[] ch  = s1.trim().toCharArray();
        int count =0;
        for(int i=0; i<=ch.length-1; i++){
            count=1;
            for (int j=i+1;j<=ch.length-1; j++){
                if (ch[i]==ch[j] && ch[i]!=' '){
                    count++;
                    ch[j]=0;

                }
            }
            if (count==1 && ch[i]!=0){
                System.out.print(ch[i]+"");
            }
        }
    }
}
