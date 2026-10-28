public class OverloadSeries {
    void series(int a, int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) s += 1.0 / Math.pow(a, i);
        System.out.println("Sum of series 1 = " + s);
    }
    void series() {
        long s = 0, f = 1;
        for (int i = 1; i <= 10; i++) {
            f *= i;
            s += f;
        }
        System.out.println("Sum of series 2 = " + s);
    }
    public static void main(String[] args) {
        OverloadSeries ob = new OverloadSeries();
        ob.series(2, 4);
        ob.series();
    }
}