package XPackX;

public class ReverseIntialString {


    public static void main(String[] args) {
//        String str = "Hello India whats up"; //o/p: olleH aidnI stahw pu
//        String rev = "";
//        String[] arr = str.split(" ");
//        String revWord = "";
//
//        for (String s : arr) {
//            for (int j = s.length() - 1; j >= 0; j--) {
//                rev = rev + s.charAt(j);
//            }
//            rev = rev + revWord + " ";
//        }
//
//        System.out.print(rev + " ");

        String str = "Abhishek Sharma";
        String [] arr= str.split(" ");
        String rev ="";
        String revWord ="";

        for(String s : arr){
            for (int i =s.length()-1;i>=0 ;i-- ) {
                rev = rev + s.charAt(i);
            }
            rev = rev + revWord;
        }
        System.out.println(rev+ " ");

    }
}

