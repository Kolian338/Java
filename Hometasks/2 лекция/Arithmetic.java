public class Arithmetic {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        double z = 3.3; // С плавающей точкой

        int a = x + y; // Арифмитические операторы
        double b = x + z;
        System.out.println(x + " + " + y + " = " + a);
        System.out.println(x + " + " + z + " = " + b);

        a = x - y;
        b = x - z;
        System.out.println(x + " - " + y + " = " + a);
        System.out.println(x + " - " + z + " = " + b);

        a = x * y;
        b = x * z;
        System.out.println(x + " * " + y + " = " + a);
        System.out.println(x + " * " + z + " = " + b);

        a = x / y; // Целочисленное и вещественное деление
        b = x / z;
        System.out.println(x + " / " + y + " = " + a);
        System.out.println(x + " / " + z + " = " + b);

        a = x % y;
        b = x % z;
        System.out.println(x + " % " + y + " = " + a);
        System.out.println(x + " % " + z + " = " + b);
    }
}
