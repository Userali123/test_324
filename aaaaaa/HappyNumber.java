import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), temp = n;
        while (temp > 9) { // Repeat until single digit
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                sum += d * d;
                temp /= 10;
            }
            temp = sum;
        }
        if (temp == 1)
            System.out.println(n + " is a Happy Number.");
        else
            System.out.println(n + " is not a Happy Number.");
    }
}