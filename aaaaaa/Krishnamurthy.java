import java.util.Scanner;
public class Krishnamurthy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10, f = 1;
            for (int i = 1; i <= d; i++) f *= i; // Factorial of digit
            sum += f;
            temp /= 10;
        }
        if (sum == n)
            System.out.println(n + " is a Krishnamurthy number.");
        else
            System.out.println(n + " is not a Krishnamurthy number.");
    }
}