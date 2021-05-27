import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = new int[]{1, 30, 2, 4, 6, 8, 5};

        sortBubble(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sortBubble(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean wasNoExchange = true;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                    wasNoExchange = false;
                }
            }

            if (wasNoExchange) {
                break;
            }
        }
    }
}

