import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[20];
        System.out.println("Enter 20 sorted integers:");
        for (int i = 0; i < 20; i++) a[i] = sc.nextInt();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt(), l = 0, u = 19, found = 0;
        while (l <= u) {
            int mid = (l + u) / 2;
            if (a[mid] == key) { found = 1; break; }
            else if (a[mid] < key) l = mid + 1;
            else u = mid - 1;
        }
        System.out.println(found == 1 ? "SEARCHING SUCCESSFUL" : "SEARCHING UNSUCCESSFUL");
    }
}