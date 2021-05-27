import java.util.Arrays;

public class ArrayRevert {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        revertArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void revertArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; ++i, --j) {
            int currentElement = array[i];
            array[i] = array[j];
            array[j] = currentElement;
        }
    }
}
