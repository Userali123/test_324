import java.util.Scanner;
public class taximeter {
    int taxino, km, b;
    String name;
    public taximeter() { // Initialize members
        taxino = 0; name = ""; km = 0; b = 0;
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Taxi No: "); taxino = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Passenger Name: "); name = sc.nextLine();
        System.out.print("Enter Kilometres Travelled: "); km = sc.nextInt();
    }
    void calculate() {
        if (km <= 1) b = km * 25;
        else if (km <= 6) b = km * 10;
        else if (km <= 12) b = km * 15;
        else if (km <= 18) b = km * 20;
        else b = km * 25;
    }
    void display() {
        System.out.println("Taxino\tName\tKilometres travelled\tBill amount");
        System.out.println(taxino + "\t" + name + "\t" + km + "\t\t\t" + b);
    }
    public static void main(String[] args) {
        taximeter ob = new taximeter();
        ob.input(); ob.calculate(); ob.display();
    }
}