import java.util.Arrays;

public class SortBySelection {
    public static void main(String[] args) {
        int[] array = new int[]{4, 8, 3, 2, 1};

        sortSelection(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sortSelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMin]) {
                    indexOfMin = j;
                }
            }

            int temp = array[indexOfMin];
            array[indexOfMin] = array[i];
            array[i] = temp;
        }
    }
}
