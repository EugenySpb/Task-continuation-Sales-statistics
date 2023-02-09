public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int statistics() {
        int stat = 0;
        int min = min();
        int max = max();
        int count = 0;
        for (int sale : sales) {
            if (sale != min && sale != max) {
                stat += sale;
                count++;
            }
        }
        return stat / count;
    }
}