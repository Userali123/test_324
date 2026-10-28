import java.util.Scanner;
public class MatrixRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        System.out.println("Enter 16 elements for 4x4 matrix:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) m[i][j] = sc.nextInt();
        int max = m[0][0], min = m[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] > max) max = m[i][j];
                if (m[i][j] < min) min = m[i][j];
            }
        }
        System.out.println("Range of the array = " + (max - min));
    }
}