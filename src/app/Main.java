package app;

public class Main {

    static int productNo;
    static String ProductName;
    static double price;
    static int amount;
    static int days;
    static double totalSales;
    static double averageDaySales;
    private final static String Currency = "EUR";

    public static void main(String[] args) {

        productNo = 1;
        ProductName = "smartphone";
        price = 311.62;
        amount = 39;
        days = 5;
        totalSales = price * amount;
        averageDaySales = totalSales / days;

        System.out.printf("Product №%d: %s,%ntotal sales for %d days is %s %.2f,%nsales by day is %s %.2f.",
                productNo, ProductName, days, Currency, totalSales, Currency, averageDaySales);

        productNo = 2;
        ProductName = "laptop";
        price = 476.66;
        amount = 22;
        days = 7;
        totalSales = price * amount;
        averageDaySales = totalSales / days;

        System.out.printf("%n%nProduct №%d: %s,%ntotal sales for %d days is %s %.2f,%nsales by day is %s %.2f.",
                productNo, ProductName, days, Currency, totalSales, Currency, averageDaySales);


    }
}
