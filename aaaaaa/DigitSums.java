import java.util.Scanner;
public class DigitSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int sum1 = 0, sum2 = 0;
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
            if (A[i] >= 0 && A[i] <= 9) sum1 += A[i];
            else if (A[i] >= 10 && A[i] <= 99) sum2 += A[i];
        }
        System.out.println("Sum of one digit numbers = " + sum1);
        System.out.println("Sum of two digit numbers = " + sum2);
    }
}