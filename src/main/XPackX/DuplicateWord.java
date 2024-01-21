package XPackX;

public class DuplicateWord {
    public static void main(String[] args) {


        String a = "I Love Java, i love selenium";
        int count;
        String c = a.toLowerCase();
        String[] b = c.split(" ");

        for (int i = 0; i <= b.length - 1; i++) {
            count = 1;
            for (int j = i + 1; j <= b.length - 1; j++) {
                if (b[i].equals(b[j])) {
                    count++;
                    b[j] = "0";
                }
            }
            if (count > 1 && b[i] != "0") {
                System.out.println(b[i]);
            }
        }
    }
}
