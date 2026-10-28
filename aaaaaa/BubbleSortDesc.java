import java.util.Scanner;
public class BubbleSortDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) a[i] = sc.nextInt();
        System.out.print("Original Array: ");
        for (int x : a) System.out.print(x + " ");
        for (int i = 0; i < 9; i++) { // Bubble sort descending
            for (int j = 0; j < 9 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                }
            }
        }
        System.out.print("\nSorted Array: ");
        for (int x : a) System.out.print(x + " ");
    }
}