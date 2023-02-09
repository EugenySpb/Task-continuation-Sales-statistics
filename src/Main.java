public class Main {
    public static void main(String[] args) {
    int[] price = {100, 2000, 3000, 40000, 500, 555, 433, 5554, 4500};
        SalesManager sales = new SalesManager(price);
        System.out.printf("Sale max = %,d руб. \n",sales.max());
        System.out.printf("Sale min = %,d руб. \n",sales.min());
        System.out.printf("Sale statistics = %,d руб. \n",sales.statistics());
        System.out.println("\nProgram completed");
    }
}
