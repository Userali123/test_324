import java.util.Scanner;
public class BookFair {
    String Bname;
    double price;
    public BookFair() { // Default constructor
        Bname = "";
        price = 0.0;
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        Bname = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }
    void calculate() {
        if (price <= 1000) price -= price * 0.02;
        else if (price <= 3000) price -= price * 0.10;
        else price -= price * 0.15;
    }
    void display() {
        System.out.println("Book Name: " + Bname + "\nPrice after discount: Rs. " + price);
    }
    public static void main(String[] args) {
        BookFair ob = new BookFair();
        ob.input();
        ob.calculate();
        ob.display();
    }
}