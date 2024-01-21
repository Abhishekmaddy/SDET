package XPackX;

public class UniqueArray {

    public static void main(String[] args) {

        //Remove duplicate Array
        int[] ab = {1, 2, 3, 1, 2, 3, 5, 56};
        int count = 0;
        for (int i = 0; i < ab.length; i++) {
            count = 1;
            for (int j = i + 1; j < ab.length; j++) {
                if (ab[i] == ab[j] && ab[i] != ' ') {
                    count++;
                    ab[j] = 0;

                }
            }

            if (count == 1 && ab[i] != 0) {
                System.out.print(ab[i] + " ");
            }
        }
    }
}
