import java.util.Scanner;
public class SuperSpy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), temp = n, sum = 0, count = 0;
        while (temp > 0) {
            sum += temp % 10;
            count++;
            temp /= 10;
        }
        if (sum == count)
            System.out.println("SUPERSPY number");
        else
            System.out.println("Not a SUPERSPY number");
    }
}