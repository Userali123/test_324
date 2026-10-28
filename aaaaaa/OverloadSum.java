public class OverloadSum {
    int Sum(int A, int B) { // Sum of even numbers between A and B
        int s = 0;
        for (int i = A; i <= B; i++) if (i % 2 == 0) s += i;
        return s;
    }
    double Sum(double N) { // Product of 1.0 * 1.2 * 1.4 * ... * N
        double p = 1.0;
        for (double i = 1.0; i <= N + 0.001; i += 0.2) p *= i;
        return p;
    }
    int Sum(int N) { // Sum of odd digits of N
        int s = 0;
        while (N > 0) {
            if ((N % 10) % 2 != 0) s += N % 10;
            N /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        OverloadSum ob = new OverloadSum();
        System.out.println("Even range sum = " + ob.Sum(4, 16));
        System.out.println("Series product = " + ob.Sum(1.6));
        System.out.println("Odd digits sum = " + ob.Sum(43961));
    }
}