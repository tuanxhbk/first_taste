package implementation;

/**
 * Created by TuanNguyen on 7/1/2016.
 */
public class Checkout {
    private int runningTotal = 0;
    public void add(int count, int price) {
        runningTotal += (count * price);
    }

    public int total() {
        return runningTotal;
    }
}
