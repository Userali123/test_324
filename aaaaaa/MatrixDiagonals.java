import java.util.Scanner;
public class MatrixDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        int ld = 0, rd = 0;
        System.out.println("Enter 16 numbers for 4x4 matrix:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) a[i][j] = sc.nextInt();
        System.out.println("The numbers of the matrix are");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
                if (i == j) ld += a[i][j];
                if (i + j == 3) rd += a[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of the numbers of the left diagonal elements = " + ld);
        System.out.println("The sum of the numbers of the right diagonal elements = " + rd);
    }
}