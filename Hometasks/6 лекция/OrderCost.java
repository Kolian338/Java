public class OrderCost {
    public static void main(String[] args) {
        System.out.println("Цена с учетом скидки = " + getDiscountPrice(5, 5, 100, 100));
    }

    public static double getDiscountPrice(int products1Count, int products2Count, double products1Price, double products2Price) {
        int productsCount = products1Count + products2Count; // Суммарное кол-во товаров
        double productsPrice = (products1Price * products1Count) + (products2Price * products2Count); // Суммарная стоимость товаров
        final int minProductsCountForDiscount = 10; // Минимум для скидки
        final int minProductsPriceForDiscount = 1000;

        if (productsCount >= minProductsCountForDiscount && productsPrice >= minProductsPriceForDiscount) { // Цена с учетом 10% скидки
            final int PERCENT_DISCOUNT = 10; // Процент скидки
            return productsPrice - (PERCENT_DISCOUNT * productsPrice / 100);
        }

        if (productsCount >= minProductsCountForDiscount || productsPrice >= minProductsPriceForDiscount) { // Цена с учетом 5% скидки
            final int PERCENT_DISCOUNT = 5;
            return productsPrice - (PERCENT_DISCOUNT * productsPrice / 100);
        }

        return productsPrice; // Цена без скидки
    }
}

