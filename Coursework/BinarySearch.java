public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 7, 10, 12};
        int number = 2;
        int leftBorder = 0;
        int rightBorder = array.length - 1;

        System.out.println("Число находится по индексу: " + binarySearch(array, number));
        System.out.println("Число находится по индексу: " + binarySearchRecursion(array, leftBorder, rightBorder, number));
    }

    private static int binarySearchRecursion(int[] array, int leftBorder, int rightBorder, int number) {
        if (leftBorder > rightBorder) {
            return -1;
        }

        int middleIndex = (rightBorder + leftBorder) / 2;

        if (number > array[middleIndex]) {
            return binarySearchRecursion(array, middleIndex + 1, rightBorder, number);
        } else if (number < array[middleIndex]) {
            return binarySearchRecursion(array, leftBorder, middleIndex - 1, number);
        } else {
            return middleIndex;
        }
    }

    private static int binarySearch(int[] array, int number) {
        int leftBorder = 0;
        int rightBorder = array.length - 1;

        while (leftBorder <= rightBorder) {
            int middleIndex = (rightBorder + leftBorder) / 2;

            if (number > array[middleIndex]) {
                leftBorder = middleIndex + 1;
            } else if (number < array[middleIndex]) {
                rightBorder = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }

        return -1;
    }
}
