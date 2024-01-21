package XPackX;

public class DuplicateCharInString {

    public static void main(String[] args) {

        String a="Rahul avindra Sonar";

        char[] ab = a.toCharArray();
        int count = 0;
        for (int i = 0; i < ab.length - 1; i++) {
            count = 1;
            for (int j = i + 1; j < ab.length - 1; j++) {
                if (ab[i] == ab[j] && ab[i] != ' ') {
                    count++;
                    ab[j] = '0';
                    break;

                }
            }

            if (count == 1 && ab[i] != '0') {
                System.out.print(ab[i] + " ");

            }
        }
    }
}
