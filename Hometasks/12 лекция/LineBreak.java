public class LineBreak {
    public static void main(String[] args) {
        String string = "1, 2, 3, 4, 5";
        String[] stringsArray = string.split(", ");

        int sum = 0;

        for (String s : stringsArray) {
            sum += Integer.parseInt(s);
        }

        System.out.println("Сумма = " + sum);
    }
}
