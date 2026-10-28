import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of a, b, and c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double d = (b * b) - (4 * a * c); // Calculate discriminant
        if (d == 0) {
            System.out.println("Roots are real and equal: " + (-b / (2 * a)));
        } else if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real: " + r1 + " and " + r2);
        } else {
            System.out.println("Roots are imaginary.");
        }
    }
}