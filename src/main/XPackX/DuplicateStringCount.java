package XPackX;

public class DuplicateStringCount {

    public static void main(String[] args) {

        //Remove duplicate Array
        String str = "So Abhishek Sharma pp";
        char[] ch = str.trim().toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    ch[j] = 0;
                    break;
                }
            }
            if (count > 1 && ch[i] != 0) {
                System.out.print(ch[i] + " ");
            }
        }

    }
}
