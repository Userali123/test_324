public class OverloadPrint {
    void print() {
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            int cols = (i == 5) ? 4 : i; // Matches 11 12 13 14 on row 5
            for (int j = 1; j <= cols; j++) System.out.print((k++) + " ");
            System.out.println();
        }
    }
    void print(int a, char ch) {
        if (ch == 's' || ch == 'S') System.out.println("Square = " + (a * a));
        else if (ch == 'c' || ch == 'C') System.out.println("Cube = " + (a * a * a));
    }
    void print(int n) {
        int temp = n, sum = 0;
        while (temp > 0) { sum += temp % 10; temp /= 10; }
        if (sum * sum * sum == n) System.out.println(n + " is a Dudeney number.");
        else System.out.println(n + " is not a Dudeney number.");
    }
    public static void main(String[] args) {
        OverloadPrint ob = new OverloadPrint();
        ob.print();
        ob.print(5, 'c');
        ob.print(512);
    }
}