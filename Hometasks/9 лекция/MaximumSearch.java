public class MaximumSearch {
    public static void main(String[] args) {
        double[] array = {100, 81, 3, 4, 150, 6, 70, 8, 9, 90};
        System.out.print("Максимальное число: " + getMax(array));
    }

    private static double getMax(double[] array) {
        double max = array[0];

        for (double e : array) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }
}

