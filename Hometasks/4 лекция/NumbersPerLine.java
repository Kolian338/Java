public class NumbersPerLine {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i <= 100) {
            if (count >= 10) {
                System.out.println();
                count = 0;
            }

            System.out.print(i + " ");
            i++;
            count++;
        }
    }
}
