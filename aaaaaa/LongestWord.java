import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine() + " ", word = "", longest = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') word += ch;
            else {
                if (word.length() > longest.length()) longest = word;
                word = "";
            }
        }
        System.out.println(longest + "\n" + longest.length());
    }
}