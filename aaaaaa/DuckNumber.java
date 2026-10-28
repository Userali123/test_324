import java.util.Scanner;
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), temp = n;
        boolean hasZero = false;
        while (temp > 0) {
            if (temp % 10 == 0) hasZero = true; // Check for zero digit
            temp /= 10;
        }
        if (n > 0 && hasZero)
            System.out.println(n + " is a Duck number.");
        else
            System.out.println(n + " is not a Duck number.");
    }
}