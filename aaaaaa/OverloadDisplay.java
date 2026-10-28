public class OverloadDisplay {
    void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j % 2 != 0 ? "1" : "0");
            System.out.println();
        }
    }
    void display(int num) {
        int s = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) s += i;
        if (s == num) System.out.println("It is a perfect number.");
        else System.out.println("It is not a perfect number.");
    }
    public static void main(String[] args) {
        OverloadDisplay ob = new OverloadDisplay();
        ob.display();
        ob.display(6);
    }
}