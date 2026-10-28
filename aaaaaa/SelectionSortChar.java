import java.util.Scanner;
public class SelectionSortChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = new char[10];
        System.out.println("Enter 10 characters:");
        for (int i = 0; i < 10; i++) c[i] = sc.next().charAt(0);
        System.out.print("Original Array: ");
        for (char x : c) System.out.print(x + " ");
        for (int i = 0; i < 9; i++) { // Selection sort descending
            int max = i;
            for (int j = i + 1; j < 10; j++)
                if (c[j] > c[max]) max = j;
            char t = c[i]; c[i] = c[max]; c[max] = t;
        }
        System.out.print("\nSorted Array: ");
        for (char x : c) System.out.print(x + " ");
    
    }
}