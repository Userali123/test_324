import java.util.Scanner;
public class TwinPrime {
    static boolean isPrime(int x) { // Helper method to check prime
        if (x < 2) return false;
        for (int i = 2; i <= x / 2; i++) if (x % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (isPrime(a) && isPrime(b) && Math.abs(a - b) == 2)
            System.out.println("(" + a + ", " + b + ") are Twin Prime numbers.");
        else
            System.out.println("(" + a + ", " + b + ") are not Twin Prime numbers.");
    }
}