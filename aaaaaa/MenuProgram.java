import java.util.Scanner;
public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Prime Number\n2. Find Greatest Digit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter a number: ");
                int n = sc.nextInt(), c = 0;
                for (int i = 1; i <= n; i++) if (n % i == 0) c++;
                System.out.println(c == 2 ? n + " is a Prime number." : n + " is not a Prime number.");
                break;
            case 2:
                System.out.print("Enter an integer: ");
                int num = sc.nextInt(), max = 0;
                while (num > 0) {
                    if (num % 10 > max) max = num % 10;
                    num /= 10;
                }
                System.out.println("Greatest digit is = " + max);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}