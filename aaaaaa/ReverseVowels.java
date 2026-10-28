import java.util.Scanner;
public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(), rev = "";
        int v = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            rev += ch;
            if ("AEIOUaeiou".indexOf(ch) != -1) v++;
        }
        System.out.println("Output: " + rev + "\nNumber of vowels = " + v);
    }
}