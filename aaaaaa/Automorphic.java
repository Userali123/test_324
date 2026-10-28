import java.util.Scanner;
public class Automorphic  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Accept number
        int sq = n * n, temp = n, p = 1;
        while (temp > 0) { // Calculate power of 10 according to digits
            p *= 10;
            temp /= 10;
        }
        if (sq % p == n)
            System.out.println(n + " is an Automorphic number.");
        else
            System.out.println(n + " is not an Automorphic number.");
    }
}